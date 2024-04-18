package day09_a_scanner;

import java.util.Scanner;

public class RateCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your salary? $");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work?");
        int hoursInWeek = input.nextInt();

        double hourlyRate = salary/(hoursInWeek*52);

        System.out.println("With the annual salary of " + salary + " working for " + hoursInWeek + " hours in a week, you hourly rate is $" + hourlyRate);


    }
}
