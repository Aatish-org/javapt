import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String txt=obj.nextLine();
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        int count_vowels=0;
        int count_consonants=0;
        for(int i=0;i<txt.length();i++){
             for(int j=0;j<vowels.length;j++){
                 if(txt.charAt(i)==vowels[j]){
                     count_vowels+=1;
                 }
                 else{
                    count_consonants+=1;
                 }
             }
        }
        System.out.println("vowels count :" +count_vowels+" "+"consonants count:"+count_consonants);
    }
}
