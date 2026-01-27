package ex_01_Java_basics;

public class Array_itration {

    static void main(String[] args) {

        int[] a = new int[4];
         a[0] = 1;
         a[1] = 10;
         a[2] = 20;
         a[3] = 30;

         for(int i : a){
             System.out.println(i);
         }
        System.out.println("=============");
         for(int i =0; i<a.length; i++){
             System.out.println(a[i]);
         }

    }
}
