package day10_if_statements;

public class CheckCharacter {
    public static void main(String[] args) {
        char letter = 'a';
        if (letter>='a' && letter <='z') {
            System.out.println("It is a lowercase");
        }
        if (letter>='A' && letter <='Z') {
            System.out.println("It is a uppercase");
        }
    }
}
