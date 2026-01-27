package ex_01_Java_basics;

import java.util.Arrays;

public class Array_2nd_highest {

    static void main(String[] args) {

        int a[] = {29, 45, 67, 89, 55};

        Arrays.sort(a);
        System.out.println("Second Highest Using Function :" + a[a.length - 2]);

        int max = a[0];
        int sec_max = a[1];
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < max) {
                sec_max = a[i];
            }
        }
        System.out.println("Second Highest Using Function :" + sec_max);
    }
}