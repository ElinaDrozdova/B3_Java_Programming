package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main (String []args){
        byte b = 40;
        int i = b; // byte value is automatically converted into int, because byte is smaller than int

       /* int i2 = 100;
        byte b2 = i2; // не работает. потому что меньше byte чем int */

        int i2 = 100;
        byte b2 = (byte) i2; // casting. We must CAST variable   данных

        System.out.println(i2);
        System.out.println(b2);

        int i3 = 150;
        byte b3 = (byte)i3;
        System.out.println(b3); //will not print 150 because byte can hold max 127 - will be a data loss

double d6 = 50; // превратит в decimal
          //byte - short - int - long - float - double



    }
}
