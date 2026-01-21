package ex_01_Java_basics;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StingBuffer_function {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.println("You entered: " + sb);
        System.out.println("Reverse String is: " +sb.reverse());
        System.out.println(sb.append("Kulkarni"));
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        System.out.println(sb.substring(1,3));


    }

}
