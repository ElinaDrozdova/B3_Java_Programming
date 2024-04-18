package day05_variables;

public class MyName {
    public static void main (String [] args){
        char first = 'E';
        char second = 'l';
        char third = 'i';
        char fourth = 'n';
        char fifth = 'a';

        System.out.println ("first = " + first);
        System.out.println ("second = " + second);
        System.out.println ("third = " + third);
        System.out.println ("fourth = " + fourth);
        System.out.println ("first = " + fifth);
        System.out.println (first + second + third + fourth + fifth); // is int

       // String name = first + second + third + fourth + fifth; // не работает потому что int

        String name = " " + first + second + third + fourth + fifth; // работает потому что это уже строка .


    }
}
