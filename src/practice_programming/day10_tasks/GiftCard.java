package practice_programming.day10_tasks;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
int budget = 100;

int price = 0;
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to the shop. Yoг can choose the following items: Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$");
        System.out.println("Please, select one of this items");
        String selectedItem = key.next();

        switch (selectedItem) {
            case "Blanket":
                price = 60;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                        break;
           case "Charger":
               price = 25;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            case "Hat":
                price = 25;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            case "Headphones":
                price = 35;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                price = 50;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            case "Pillow":
                price = 40;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Socks":
                price = 5;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            case "USB cable":
                price = 10;
                System.out.println("Thank you for your purchase!\nYour current balance is: $" +  (budget-price));
                break;
            default:
                System.out.println("Invalid item!");

        }

    }
}


