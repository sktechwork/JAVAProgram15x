package ex_01_Java_basics;

import java.util.Arrays;

public class Array_program {
    static void main(String[] args) {

        int a1[] = {1, 2, 3, 4};
        int a2[] = {3, 4, 5, 5};
        System.out.println("Length of a1: " +a1.length);
        System.out.println("Length of a2: " +a2.length);
        System.out.println(a1.equals(a2));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

    }
}
