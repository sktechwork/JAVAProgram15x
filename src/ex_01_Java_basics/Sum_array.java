package ex_01_Java_basics;

public class Sum_array {
    static void main(String[] args) {

        int a[] ={10,28,33};
        int sum =0;
        for(int i =0; i<a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("Sum Of the array is: "+sum);
    }
}
