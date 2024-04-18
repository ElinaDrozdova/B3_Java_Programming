package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("enter the price of the item: ");
        double price = keyboard.nextDouble ();
        System.out.println("enter the quantity of the item: ");
        double quantity = keyboard.nextInt ();

        double revenue = price * quantity;

        System.out.println("The revenue is $" + revenue);
    }
}
