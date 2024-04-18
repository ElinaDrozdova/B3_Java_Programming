package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
String typeOfPizza = "Cheese";
int numOfSlices = 10;
int numOfPeople = 4;
int slicesPerPerson = numOfSlices / numOfPeople;
int slicesLeftOver = numOfSlices % numOfPeople; // reminder

        System.out.println("We orderd " + typeOfPizza + " pizza with " + numOfSlices + "." + numOfPeople + " people ate "  + slicesPerPerson + " for each and " + slicesLeftOver + " is left.");
    }
}