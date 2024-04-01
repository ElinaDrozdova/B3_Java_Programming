package day06_a_arithmetic_operators;

public class House {

    public static void main (String []args){
       // String houseType = "Penthouse";
       // String fullAddress = "1234 Test St";
        String houseType = "Penthouse", fullAddress = "1234 Test St"; //we can declare anв assign this way
        int numOfBedroom = 4;
        byte numOfBathRoom = 3;
        int numOfKitchen = 2;
        boolean hasBasement = false;
        boolean hasPool = true;
        boolean isOnSale = false;
        boolean hasAttic = false;
        double costOfHouse = 999_999.99;

        int zipCode = 54678;
        boolean hasPark = true;
        double schoolRating = 4.9;

        String houseInfo = "The " + houseType + " on " + fullAddress + ", " + zipCode + " costs $" + costOfHouse + "\n\tThe " + houseType + " has the attic: " + hasAttic + ", \n\thas a pool: " + hasPool + " \n\tis on sale: " + isOnSale + ", \n\thas a park: " + hasPark + ". \n\tThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);
    }
}
