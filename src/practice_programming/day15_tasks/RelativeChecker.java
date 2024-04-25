package practice_programming.day15_tasks;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please print name and last name of the first person");
        String name1 = input.nextLine();

        System.out.println("Please print name and last name of the second person");
        String name2 = input.nextLine();

        name1 = name1.toLowerCase().substring(name1.indexOf(" "));
        name2 = name2.toLowerCase().substring(name2.indexOf(" "));
        if (name1.equals(name2)){
            System.out.println("Related");
        }
        else {
            System.out.println("Not related");
        }
    }
}



/* Task #6 - RelativeChecker

    Create a class called RelativeChecker in your Practice_Programming project and inside the p_p.day15_tasks package

        Task:
                Given two full names check if the two people are related.
                They will be considered to be related if they have the same last name
                    Ex:
                        Input:
                            James Bond
                            Jamie Bond
                        Output:
                            Related

                        Input:James Bond
                              Alex Benji
                        Output:
                              Not Related
				 */