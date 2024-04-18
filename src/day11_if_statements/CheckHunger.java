package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Are you hungry? true/false");
        boolean isHungry = input.nextBoolean();
        //boolean isHungry = true;
        //Approach 1 - single if statement
     /*   if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you.");
        }
        if (!isHungry){
            System.out.println("Great, practice Java");
        } */
        if (input.nextBoolean()) {
            System.out.println("You are hungry, so I will get some food for you.");
        }
        if (!input.nextBoolean()){
            System.out.println("Great, practice Java");
        }
        //Approach 2 - IF ELSE statement
        if (isHungry){

            System.out.println("You are hungry, so I will get some food for you.");

        } else {
            System.out.println("Great, practice Java");
        }
// Approach #3 - IF-ELSE statement -  same as above - just to show the syntax with NO BRACKETS
        if (isHungry)
            System.out.println("You are hungry, so I will get some food for you.");
        else
            System.out.println("Great, then practice java");
    }

}
