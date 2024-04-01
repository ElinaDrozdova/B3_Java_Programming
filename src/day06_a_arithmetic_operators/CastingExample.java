package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        int num1 = 40;
        float num2 = num1; // int is smaller than float. implicit / automatic casting happens
        System.out.println (num1);

        float num3 = 10.5F;
        short num4 = (short)num3; //short is smaller than float. we need casting - explicit casting /Manual / NARROWING casting - DATA LOSS

        System.out.println (num3);
        System.out.println (num4);

        float num5 = 300;
        byte num6 = (byte)num5; //we need casting - explicit/manual/narrowing casting - data loss (big data loss because byte can hold only 127)

        //I can convert char to int because each character has a number assigned ti it. So I am actually converting the number datatype to number datatype
        char letter = 'B';
        int letterInt = letter;

        System.out.println (letter);
        System.out.println (letterInt);

        System.out.println ('B'); // B
        System.out.println ((int) 'B'); //66 напечатает

    }
}