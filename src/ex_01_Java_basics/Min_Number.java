package ex_01_Java_basics;

import java.util.Scanner;

public class Min_Number {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=sc.nextInt();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter 2nd number");
        int n2=sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 3rd number");
        int n3 = sc.nextInt();

        int min = (n1<n2)?n1:n2;
       System.out.println("Minimum number between n1 and n2 is :"+min);

        int min2 =(min<n3)?min:n3;
        System.out.println("Minium number between n1, n2 and n3 is :"+min2);

    }
}
