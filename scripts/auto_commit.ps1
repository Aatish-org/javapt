param(
    [string]$RepoPath = ".",
    [string]$Branch = "main",
    [string]$Remote = "origin",
    [int]$DebounceSeconds = 2,
    [switch]$Once,
    [string]$CommitPrefix = "Auto-commit"
)

# Resolve full path
$fullPath = (Resolve-Path -Path $RepoPath).Path
Write-Host "Repo: $fullPath"

# Helper: perform git add/commit/push
function Do-Commit {
    try {
        Write-Host "Staging changes..."
        git -C "$fullPath" add -A 2>&1 | Write-Host
        # Use subexpression to avoid PowerShell interpreting the colon as part of a variable name
        $msg = "$($CommitPrefix): $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')"
        Write-Host "Committing with message: $msg"
        $commitOutput = git -C "$fullPath" commit -m "$msg" 2>&1
        if ($LASTEXITCODE -ne 0) {
            Write-Host "git commit returned non-zero. Output:`n$commitOutput"
        } else {
            Write-Host $commitOutput
        }
        Write-Host "Pushing to $Remote/$Branch..."
        $pushOutput = git -C "$fullPath" push $Remote $Branch 2>&1
        Write-Host $pushOutput
    } catch {
        Write-Host "Error during git operations: $_"
    }
}

# If repo path doesn't exist, exit
if (-not (Test-Path $fullPath)) {
    Write-Host "Repository path not found: $fullPath"
    exit 1
}

# Create FileSystemWatcher
$fsw = New-Object System.IO.FileSystemWatcher $fullPath
$fsw.IncludeSubdirectories = $true
$fsw.NotifyFilter = [System.IO.NotifyFilters]('FileName','LastWrite','Size')
$fsw.Filter = '*.*'

# Expose watcher to global scope so the event action can unregister/dispose it
Set-Variable -Name fsw -Value $fsw -Scope Global

# Debounce timer stored in script scope
$script:timer = $null

$action = {
    param($sender, $eventArgs)
    # Start/Reset debounce timer
    if ($script:timer) {
        $script:timer.Stop()
        $script:timer.Dispose()
    }
    $script:timer = New-Object System.Timers.Timer($using:DebounceSeconds * 1000)
    $script:timer.AutoReset = $false
    $script:timer.add_Elapsed({
        Write-Host "\n[watcher] Debounce timer elapsed. Running commit..."
        Do-Commit
        if ($using:Once) {
            Write-Host "Once mode enabled - stopping watcher and exiting."
            # Unregister events and dispose the watcher
            Unregister-Event -SourceIdentifier FSChanged -ErrorAction SilentlyContinue
            Unregister-Event -SourceIdentifier FSCreated -ErrorAction SilentlyContinue
            Unregister-Event -SourceIdentifier FSRenamed -ErrorAction SilentlyContinue
            Unregister-Event -SourceIdentifier FSDeleted -ErrorAction SilentlyContinue
            try { $global:fsw.EnableRaisingEvents = $false } catch {}
            try { $global:fsw.Dispose() } catch {}
            # Give time for output to flush, then exit process
            Start-Sleep -Milliseconds 200
            exit 0
        }
    })
    $script:timer.Start()
}

# Register events
Register-ObjectEvent -InputObject $fsw -EventName Changed -SourceIdentifier FSChanged -Action $action | Out-Null
Register-ObjectEvent -InputObject $fsw -EventName Created -SourceIdentifier FSCreated -Action $action | Out-Null
Register-ObjectEvent -InputObject $fsw -EventName Renamed -SourceIdentifier FSRenamed -Action $action | Out-Null
Register-ObjectEvent -InputObject $fsw -EventName Deleted -SourceIdentifier FSDeleted -Action $action | Out-Null

$fsw.EnableRaisingEvents = $true
Write-Host "Watching $fullPath for changes (debounce ${DebounceSeconds}s). Press Ctrl+C to stop."

# Keep process alive
while ($true) { Start-Sleep -Seconds 1 }
