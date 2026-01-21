package ex_01_Java_basics;

import java.util.Scanner;

public class String_program{

   public static void main() {

       String s = " Sayali";

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 2nd String");
       String s1 = sc.next();

       System.out.println(s.length());
       System.out.println(s.toLowerCase());
       System.out.println(s.toUpperCase());
       System.out.println(s.charAt(2));

       System.out.println(s.isEmpty());
       System.out.println(s.equals(s1));
       System.out.println(s.compareTo(s1));
       System.out.println(s1.isBlank());


       System.out.println(s != s1);
       System.out.println(s == s1);

       String s3 = s.replace('S','K');
       System.out.println(s3);

       System.out.println(s.concat(s3));
       System.out.println(s.concat(s1));
       System.out.println(s.endsWith("i"));
       System.out.println(s.equalsIgnoreCase(s1));
       System.out.println(s.replaceAll("Sayali", "SK"));

       System.out.println(s.trim());



   }
}
