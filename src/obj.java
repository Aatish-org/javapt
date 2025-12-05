import java.util.Scanner;


public class obj {
    String name;
    int age;
    obj(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name is "+name+" and age is "+age);
    }
    static void main(String[] args) {
        /*Scanner oops=new Scanner(System.in);
        String name1=oops.nextLine();
        int age1=oops.nextInt();
        obj obj1=new obj(name1,age1);
        String name2=oops.nextLine();
        int age2=oops.nextInt();
        obj obj2=new obj(name2,age2);
        oops.close();*/
        obj obj1=new obj("jack",18);
        obj onj2=new obj("jhon",45);
    }
}