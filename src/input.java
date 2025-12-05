import java.util.Scanner;

public class input{
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       boolean isPrime=true;
       for(int i=2;i<=Math.sqrt(n);i++) {
           if (n % i == 0) {
               isPrime = false;
               break;
           }
       }
       if(isPrime){
              System.out.println("Prime Number");
         } else{
              System.out.println("Not a Prime Number");
       }
    }
}