package day04_variables;
/*
Primitive - total 8
integer types^ byte - short - int - long
floating types  float - double
character    char
boolean - boolean
 */
public class PrimitiveDataTypes {
    public static void main (String []args){
        byte age = 60;
        System.out.println("age");
        System.out.println(age); // datatype is byte
        System.out.println(60); //datatype is int

        short year; //declared a variable called year (datatype short)
        year = 2024; //assigned a value, 2024, into my variable called year
        System.out.println(year); //is short
        System.out.println(2024); //is int

        long bigNumber;
        bigNumber = 8999999997666L; //adding L to the end of number , tells a compiler that its a long number


    }
}
