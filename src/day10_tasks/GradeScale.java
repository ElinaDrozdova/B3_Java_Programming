package day10_tasks;

import java.util.Scanner;

public class GradeScale {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a percentage number to see your grade (from 0 to 100): ");
        int num = key.nextInt();
        if (num >=85 && num<=100) {
            System.out.println("It is A");
        } else if (num >=70 && num <= 84) {
            System.out.println("It is B");
        } else if (num >=55 && num <=69) {
            System.out.println("It is C");
        } else if (num>= 40 && num <=54) {
            System.out.println("It is D");
        } else if (num>=0 && num <= 40) {
            System.out.println("Below 40");

        } else {
            System.out.println("Your values are invalid, no grade");
        }
    }
}