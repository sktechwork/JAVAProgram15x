package ex_01_Java_basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_case {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a week number (1-7)");
        int week = sc.nextInt();

        switch (week){

            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;

                default:
                    System.out.println("Invalid input");

                sc.close();

        }
    }
}
