package day10_tasks;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a month number [1-12]: ");
        int num = scan.nextInt();
        String message = "";

        switch (num) {
            case 2:
                message = "has 28 days";
                System.out.println(message);
                break;
            case 1,3,5,7,8,10,12:
                message = "has 31 days";
                System.out.println(message);
                break;
            case 4,6,9,11:
                message = "has 30 days";
                System.out.println(message);
                break;
        }
    }
}

/* 28 days: 2
        		30 days: 4,6,9,11
        		31 days: 1,3,5,7,8,10,12*/