package ex_01_Java_basics;

public class Max_Number {

    static void main() {

        int n1 = 2;
        int n2 = 88;
        int n3 = 111;
        int n4 = 588;

        int max = (n1>n2)? n1:n2;
        System.out.println("Max number between n1 and n2 is :" + max);

        int max2 = (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("Max number between n1,n2 and n3 is :" + max2);

        int max3 = (n1>n2)?n1:n2;
        max3 = (n3>max3)?n3:max3;
        max3 = (max3>n4)?max3:n4;
        System.out.println("Max number between n1,n2 n3and n4 is :" + max3);


    }
}
