import java.util.Scanner;

public class Average {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("Addition of two numbers : " + c);

        int avg = c/2;
        System.out.println("Average of two numbers : " + avg);

    }
}
