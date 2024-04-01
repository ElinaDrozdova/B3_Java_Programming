package day04_variables;

public class FloatingNumbers {
    //in java we cannot store fractions

    public static void main(String[] args) {
        System.out.println(3 / 4); //0.75

        // how we store decimal numbers: 4.5 or 5.99
        double price = 3.99;
        float average = 0.19F;
        System.out.println(price); //double
        System.out.println(average); //float
        System.out.println(4.5); // by default its double

    }
}