import java.util.Scanner;

public class calc {
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        return a/b;
    }
    public static void main(String[] args) {
        calc obj=new calc();
        System.out.println(obj.add(10,20));
    }
}
