package ex_01_Java_basics;

import java.util.Scanner;

public class do_while_loop {

    static void main(String[] args) {

       // int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i =sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=20);

        System.out.println("=========");
        //int j =20;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number :");
        int j = sc1.nextInt();
        System.out.println("=========");
        do{
            System.out.println(j);
            j--;
        }while(j>=0);
        System.out.println("=========");
    }
}
