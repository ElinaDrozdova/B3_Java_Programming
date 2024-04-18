package day09_a_scanner;
//1st we need to have the import
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
       //2nd we declare the Scanner reference and assign an object to it
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt ();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt ();
        boolean areNumsEqual = num1 ==num2;
        System.out.println("Numbers are equal: " + areNumsEqual);
    }
}
