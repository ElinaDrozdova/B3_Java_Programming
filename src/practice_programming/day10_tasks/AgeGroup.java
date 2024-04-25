package practice_programming.day10_tasks;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        if (age<= 1) {
            System.out.println("infant");
        }
        if (age>=2&&age<=5) {
            System.out.println("toddler");
        }
        if (age>=6&&age<=9){
            System.out.println("kid");
        }
        if (age>=10&&age<=12){
            System.out.println("pre-teen");
        }
        if (age>=13&&age<=17){
            System.out.println("teenager");
        }
        if (age>=18&&age<=20){
            System.out.println("young adult");
        }
        if (age>=21&&age<=35){
            System.out.println("adult");
        }
        if (age>=36&&age<=55){
            System.out.println("middle-aged adult");
        }
        if (age>=56&&age<=120){
            System.out.println("senior citizen");
        }
        if (age<0||age>120){
            System.out.println("invalid entry");
        }
    }
}


/*Create a class called AgeGroup in your Practice_Programming project and inside the p_p.day10_tasks package

Task:
create a main method

Write a program that can define the age groups of someone based on their given age:

infant (< 1 year)
Toddler (3 - 5)
Kid (6 - 9
     Pre-Teen (10 - 12)
Teenager (13 - 17)
Young Adult (18 - 20)
Adult (21 - 35)
Middle-Aged Adult (36 - 55)
Senior Citizen (55+)

Challenge: if age > 120 or less than 0 ==> invalid entry */