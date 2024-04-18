package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 angles number: ");
        double anglOne = input.nextDouble();
        double anglTwo = input.nextDouble();
        double anglThree = input.nextDouble();

        double total = anglOne + anglTwo + anglThree;
        boolean isTriangle = total ==180;
        boolean isCircle = total==360;
        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);
    }
}
