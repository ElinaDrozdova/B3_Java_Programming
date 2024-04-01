package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {
       byte numberOfCoffeeCups;
       double totalPriceOfCoffee;
       int totalNumberOfStudentsInClass;

       //we cant use the variables because they do not have a value yet

// assign values
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalNumberOfStudentsInClass = 100;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalNumberOfStudentsInClass);

        //print out like this: $numberOfCoffeeCups + $totalNumberOfStudentsInClass
        System.out.println(numberOfCoffeeCups + "*" + totalNumberOfStudentsInClass);

        // Declare and Assign
        double temperature = 30.5;
        int javaDay = 5;
        System.out.println("Today the temperature was " + temperature);
        System.out.println("It is Day  " + javaDay + " in Java class.");

    }
}
