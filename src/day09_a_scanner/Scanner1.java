package day09_a_scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
      //1st Scanner Object declaration
        // Scanner input     ---- input is object reference name

        Scanner input = new Scanner (System.in); //scanner object declaration

        System.out.println("Please, enter a number");
        int userNumber=input.nextInt(); //returns input as int  ---- I can assign it into int variable
        System.out.println("You entered " + userNumber);
    }
}
