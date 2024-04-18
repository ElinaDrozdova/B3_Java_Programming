package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your favorite book: ");
        String favoriteBook = input.nextLine(); //accepts enter as input
        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your favorite number: ");
        long favoriteNum = input.nextLong(); // Enter
       // System.out.println("Enter your favorite book: ");
       // String favoriteBook = input.nextLine(); //accepts enter as input
        System.out.println("Information: ");
        System.out.println(age);
        System.out.println(favoriteNum);
        System.out.println(favoriteBook);


    }
}
