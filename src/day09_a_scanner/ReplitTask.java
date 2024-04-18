package day09_a_scanner;

import java.util.Scanner;

public class ReplitTask {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
            System.out.println("Welcome to the Grader! \nPlease enter subject name number 1 and score for this subject");
            String number1 = input.nextLine();
        double score1=input.nextDouble();
        input.nextLine();

            System.out.println("Please enter subject name number 2 and score for this subject");
            String number2 = input.nextLine();
        double score2=input.nextDouble();
        input.nextLine();

            System.out.println("Please enter subject name number 3 and score for this subject");
            String number3 = input.nextLine();
        double score3=input.nextDouble();
        input.nextLine();

            System.out.println("Please enter subject name number 4 and score for this subject");
            String number4 = input.nextLine();
        double score4=input.nextDouble();
        input.nextLine();

            System.out.println("Please enter subject name number 5 and score for this subject");
            String number5 = input.nextLine();

            double score5=input.nextDouble();
        input.nextLine();

        double averageScore = (score1+score2+score3+score4+score5)/5;

            System.out.println("Summary: " + number1 + " - " + score1 + ", " + number2 + " - " + score2 + ", " +  number3 + " - " + score3 + ", " + number4+ " - " + score4+ ", " + number5 + " - " + score5);
            System.out.println("Your average score is: " + averageScore);
            System.out.println("Thank you for using Grader! \nGoodbye!");
        }
    }

