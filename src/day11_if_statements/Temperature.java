package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.println("Please. enter the temperature: ");
        int temp = key.nextInt();
        //this is the same as one below
        if (temp>70 || temp==70){

        }
        if (temp>=70){
            System.out.println("Go outside");
        }
    if (temp<70){
        System.out.println("It is too cold");
    }

    }

}
