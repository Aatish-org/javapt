import java.util.Scanner;

class Book{
    String Book_name;
    int qty;
}

class Member{
    String name;
    int age;

}

public class lib_mng {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the name of the library:");
        String lib_name=obj.nextLine();
        System.out.print("Enter the number of books:");
        int n=obj.nextInt();
        System.out.println("The library name is: "+lib_name+" and the number of books is: "+n);
    }
}
