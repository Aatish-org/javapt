public class function{

    static int fact(int n){
        if(n==1){ return 1;}
        else{return n*fact(n-1);}
    }

    static int fibos(int n){
        if(n==1){ return 1;}
        if(n==0){ return 0;}
        else{ return fibos(n-1)+fibos(n-2);}
    }

    public static void  main(String args[]){
        int fact=4;
        System.out.println("Factorial of "+fact+" is: "+fact(fact));
        int fib=3;
        System.out.println("Fibonacci of "+fib+" is: "+fibos(fib));
    }
}