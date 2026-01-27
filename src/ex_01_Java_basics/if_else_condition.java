package ex_01_Java_basics;

import java.util.Scanner;

public class if_else_condition {

    static void main(String[] args) {
         int a, b, c;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter first number");
         a=sc.nextInt();
         System.out.println("enter second number");
         b=sc.nextInt();
         System.out.println("enter third number");
         c=sc.nextInt();

         if(a>b && a>c){
             System.out.println(a+" "+"is greater number");
         } else if (b>a && b>c) {
             System.out.println(b+" "+ "is greater number");
         }else if (c>a&&c>b){
             System.out.println(c+" "+"is greater number");
         }else {
             System.out.println("All numbers are equal");
         }
    }
}
