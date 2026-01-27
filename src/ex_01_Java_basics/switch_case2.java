package ex_01_Java_basics;

import java.util.Scanner;

public class switch_case2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println("Marathi");
                break;
            case 2:
                System.out.println("English");
                break;
            case 3:
                System.out.println("Hidi");
                break;
            case 4:
                System.out.println("Gujrathi");
                break;
            case 5:
                System.out.println("Sanskrit");
                break;
            case 6:
                System.out.println("Tamil");
                break;
            case 7:
                System.out.println("Kannada");
                break;
            case 8:
                System.out.println("Malyalam");
                break;

            default:
                System.out.println("Invalid input");

        }
    }
}
