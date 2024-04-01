package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main (String []args){
        double num1 = 7;
        double num2 = 5;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 *num2;
        double division = num1 / num2;
        double reminder = num1 % num2; //module    7/5 = whatever is not divisible will be the remainder
        System.out.println (num1 + " + " + num2 + " = " + addition);


        num1 = 13;
        num2 = 5;
        reminder = num1%num2; //data loss will be исы int data type
        System.out.println (num1 + " % " + num2 + " = " + reminder);

        int n1 = 7;
        int n2 = 5;
        int result = n1/n2;

        System.out.println (result); //1/4 ---1

        System.out.println (3.2 +1); //4 or 4/2 - output double

        byte b2 =3;
        short s2 = 7;
                // short total = b2 + s2; // не работает т.к. компайлер превращает их в int
       short total = (short)(b2 +s2); //.by default anything smaller than int, will became as int after any operation/ .нужны скобки, чтоб превратить их в short

        int a1 = 4;
        int a2 = 5;
        double d2 = a1 + a2;


    }
}
