package day06_tasks;

public class Pizza {
    public static void main(String[] args) {
        String pizza = "cheese";
        int pizzaSlices = 8;
        int people = 4;
int slicesPerPerson = pizzaSlices / people;
        System.out.println("We ordered " + pizza + " pizza\n" +
                "with " + pizzaSlices + " slices, " + people + " people ate " + slicesPerPerson +  " slices each");
    }
}