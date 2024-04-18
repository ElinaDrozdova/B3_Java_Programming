package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name is: ");
        String lastName = input.next();

        System.out.println( " Are you employed? [true/false]");
        boolean isEmployed = input.nextBoolean();

        System.out.println( " Are you student? [true/false]");
        boolean isStudent= input.nextBoolean();

        String personalInfo = firstName + lastName + "is employed: " +isEmployed + " and the person is a student: " + isStudent;
        System.out.println(personalInfo);

    }
}
