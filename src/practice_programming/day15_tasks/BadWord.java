package practice_programming.day15_tasks;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print a message:");
        String message = input.nextLine();
        if (message.contains("idiot")|| message.contains("dumb")||message.contains("heck")){
            System.out.println("Message not sent");
            }
        else{
            System.out.println("Message sent");
        }

    }
}


/* Task #3 - BadWord

    Create a class called BadWord in your Practice_Programming project and inside the p_p.day15_tasks package

        Task:
    		Given a String variable with a message.
    		You will check if the message contains any of these bad words: “idiot, dumb, heck”

        		If the message contains any of those words print: “Message not sent”.
        		If the message is bad word free print “Message sent”

 */