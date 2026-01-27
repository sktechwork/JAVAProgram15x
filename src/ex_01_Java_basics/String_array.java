package ex_01_Java_basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_array {

    static void main(String[] args) {

        String name[] = {"Sayali" , "Savita", "Swati", "Sanyukta"};

        for(String s : name){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(name));

        System.out.println("Length Array:" +name.length);

        }
}
