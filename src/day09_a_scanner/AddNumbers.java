package day09_a_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in); //declared Scanner Reference and assigned a Scanner Object to it
        System.out.println("Please enter 3 numbers and hit enter after each");
        int num1 = key.nextInt ();
        int num2 = key.nextInt ();
        int num3 = key.nextInt ();

        System.out.println("The sum of the numbers: " + (num1 + num2 + num3) );



    }
}
