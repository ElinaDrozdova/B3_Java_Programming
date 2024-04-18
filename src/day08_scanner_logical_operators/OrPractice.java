package day08_scanner_logical_operators;

public class OrPractice {
    public static void main(String[] args) {
        int apples = 5;
        int oranges = 10;
        System.out.println(apples > 1 || oranges <5);
        //true||false
        //true
        System.out.println(apples > 10 || oranges ==5);
        // false||true
        //true
        System.out.println(apples > 10 && oranges ==10); //since this is && and 1st part is false, I actually do not need to check the 2nd side
        //false&&true
        //false
    }
}