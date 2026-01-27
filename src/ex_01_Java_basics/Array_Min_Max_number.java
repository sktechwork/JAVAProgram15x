package ex_01_Java_basics;

public class Array_Min_Max_number {
    static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 10, 50};
        // one way
//               Arrays.sort(a);
//               System.out.println(a[a.length-1]);
        //max value in array
        int max = a[0];

        for(int x : a){

            if(x>max){
                max = x;
            }
        }System.out.println("Maximum Number :" +max);
        //min value in array
        int min = a[0];

        for(int i=0;i<a.length; i++){

            if(a[i]< min){
                min = a[i];
            }
        }
        System.out.println("Min Value:" +min);




    }
}
