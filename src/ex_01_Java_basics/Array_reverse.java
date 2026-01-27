package ex_01_Java_basics;

import java.util.Arrays;

public class Array_reverse {

    static void main(String[] args) {

        int a[] = {10, 20, 40, 49, 22};

        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
