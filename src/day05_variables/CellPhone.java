package day05_variables;

public class CellPhone {
    public static void main (String []args){
        String brand = "Apple";
        String model = "Iphone 14 Pro";
        String color = "Silver";
        double price = 999.99;
        int storage  = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have a " + model  + "from " +  brand);
        System.out.println("It came in color " + color + " and it has " + storage + " GB");
        System.out.println ();
        // 2nd approach
        System.out.println();
        String fullMessage = "I have an " + model + " from " + brand + ". \nIt came in the color " + color + " and it has " +  storage+ " GB. \nFor the sim type " + sim + " with a camera: " + hasCamera + ", the total price is $" + price;


        System.out.println(fullMessage);

    }
}
