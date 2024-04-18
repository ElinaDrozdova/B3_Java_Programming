package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
int n= 20;

        System.out.println(n>5); //true
        System.out.println(n<10); //false

        System.out.println(n>5 && n<10); //
        //true&&false
        //false
        System.out.println(4>5 || false); //or
        //true||false
        //true
        System.out.println(3>4 && false); //
        //false||false
        //false
        System.out.println (true); //true
        System.out.println (!true);//false
        System.out.println (4!=4); //not equal --- false
    }
}