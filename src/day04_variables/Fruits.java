package day04_variables;

public class Fruits {
    public static void main (String[] args){

        int apples = 50;
        int grapes = 100;
        int bananas = 150;
        System.out.println("This is how many apples we have: " +70); //the value 70 is HARDCODED
        System.out.println("This is how many apples we have: " +apples); //the value is DYNAMICALLY used
        System.out.println("Grapes: " +grapes);
        System.out.println("Bananas: " +bananas);

        //Reassignment
        System.out.println("Sold out some of apples");
        apples = 30; //I reassigned container called apple to have 30

        int price = 15;
        System.out.println("The price of my 30 apples is $15");
        System.out.println("The price of my " + apples + " apples is $" + price);
    }

}
