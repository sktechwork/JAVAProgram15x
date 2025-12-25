public class Swap_Numbers {

    static void main(String[] args) {


        int a = 20, b = 40;
        int c = 0;

        System.out.println("Numbers before swapping :"+" a="+a + " b=" +b );
        // using third variable
        c=a;
        a=b;
        b=c;

        System.out.println("Numbers after swapping using third variable :"+" a="+a + " b=" +b );

        //without using third variable
        a=a-b;
        b=a+b;
        System.out.println("Numbers after swapping without using third variable:"+" a="+a + " b=" +b );
    }
}
