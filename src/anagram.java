import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        String str2=obj.nextLine();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
        obj.close();
    }
}
