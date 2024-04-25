package practice_programming.day15_tasks;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print a word:");
        String word = input.nextLine();
        int middleIndex = word.length()/2;
        if (word.length()%2==0){
            System.out.println(word.substring(middleIndex-1, middleIndex+1));
        }
else{
            System.out.println(word.substring(middleIndex, middleIndex+1));
        }
    }
}


/* Create a class called MiddleChar in your Practice_Programming project and inside the p_p.day15_tasks package

        Task:
                Given a String, write a program to display the middle character of a string

                a) If the length of the string is even there will be two middle characters.
                b) If the length of the string is odd there will be one middle character.
                    Ex:
                        Input: elephant
                        Output: The middle characters: ph */