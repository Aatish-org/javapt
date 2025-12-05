import java.util.Scanner;

class string{
    public static void main(String[] args) {
        int n,target;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n = obj.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the target number:");
        target = obj.nextInt();
        System.out.println("");
        for(int i = 0; i<n;i++){
            Scanner ele = new Scanner(System.in);
            System.out.print("Enter the element "+(i+1)+" :");
            arr[i]=ele.nextInt();
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){System.out.println("The two numbers are "+arr[i]+" and "+arr[j]);}
            }
        }
    }
}
