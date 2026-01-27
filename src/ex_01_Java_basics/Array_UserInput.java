package ex_01_Java_basics;

import java.util.Scanner;

public class Array_UserInput {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int n = sc.nextInt();

        int a [] = new int[n];
//this for loop is for read the user input.
        for(int i=0; i<a.length; i++){
            System.out.println("Enter the "+(i+1)+" element :");
            a[i] =sc.nextInt();
        }
        //this for loop is for print the user input.
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("===============");

        for(int i:a){
            System.out.println(i);
        }



    }
}
