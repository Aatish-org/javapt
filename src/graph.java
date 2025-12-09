import java.util.Scanner;

public class graph {
    int g[][],n;
    graph(int n){
        this.n=n;
        g=new int[n][n];
    }

    void createGRAPH(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Edge from "+i+" to "+j+" to be present(1) or absent(0): ");
                g[i][j]=sc.nextInt();
            }
        }
    }

    void bfs(int g[][],int start){
        boolean visited[]=new boolean[n];
        int queue[]=new int[n];
        int front=-1,rear=-1;
        visited[start]=true;
        queue[++rear]=start;
        while(front!=rear){
            start=queue[++front];
            System.out.print(start+" ");
            for(int i=0;i<n;i++){
                if(g[start][i]==1 && !visited[i]){
                    visited[i]=true;
                    queue[++rear]=i;
                }
            }
        }
   }
    void dfs(int g[][],int start){

    }
    public static void main(String[] args) {
        int[][] adjmatrix=new int[9][9];
        graph gr=new graph(9);
        gr.createGRAPH();
        System.out.println("BFS Traversal starting from vertex 0:");
        gr.bfs(gr.g,0);

    }
}
