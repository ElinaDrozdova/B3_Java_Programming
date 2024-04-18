package day12_switch_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a language by the number from options below: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijan\n\n\tChoose an option: ");
        int userOption = key.nextInt(); //

        if (userOption == 1) {
            System.out.println("\n\thello, thanks for your call");
        } else if (userOption == 2) {
            System.out.println("\n\thola, gracias para llamar");
        } else if (userOption == 3)  {
            System.out.println("\n\tmerhaba, aradiginiz icin tesekkurler");
        } else if (userOption == 4) {
            System.out.println("\n\tprivet, spasibo za vash zvonok");
        } else if (userOption == 5) {
            System.out.println("\n\tMerci ,pour votre appel");
        } else if (userOption == 6) {
            System.out.println("\n\tsalam, zeng ettiginiz ucun mennatdariq");
        }


    }
}