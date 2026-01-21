package ex_01_Java_basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class String_Operation2 {

    static void main() {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("String s1 :" +s1);
        System.out.println("String s2 :" +s2);
        System.out.println("s1 == s2 :" + (s1 == s2));

        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter the String :");
           String s4 =s3.nextLine();


            String s5 = "";

            for(int i=s4.length()-1; i>=0; i--) {
                s5 = s5 + s4.charAt(i);

            }
            System.out.println(s5);

            if (s4.equals(s5)) {
                System.out.println(s4 +" " + "is Palindrome String");
            }else {
                System.out.println(s4 + " " +"is not Palindrome String");
            }
        }

}
