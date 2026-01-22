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
        System.out.println(sb.substring(1,3)); //convert the string buffer to string
        System.out.println(sb.toString());
        System.out.println(sb.delete(1,3)); // delete the character 0,1,2 i.e. (n-1)
        System.out.println(sb.indexOf("madam"));
        System.out.println(sb.lastIndexOf("madam"));
        System.out.println(sb.codePointAt(2)); // returns the ascii value

        StringBuffer sb2 = new StringBuffer("MADAM");
        System.out.println(sb.compareTo(sb2));

        System.out.println(sb.equals(sb2)); //compare the value between two stringbuffer
        System.out.println(sb.toString().repeat(2));

        System.out.println(sb.isEmpty());
        System.out.println(sb.capacity()); //returns the current capacity of the StringBuffer




    }

}
