package day09_a_scanner;

import java.util.Scanner;

public class ReplitTask2 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        //Enter your code here
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        String firstName = scan.next();
        scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        scan.nextLine();

// this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();

        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
// continue for city
        scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();
        scan.nextLine();
        System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        String workPhone = scan.next();
        scan.nextLine();
        System.out.println("Enter your personal phone number");
        String personalPhone = scan.next();
        scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        scan.nextLine();
        System.out.println("Are you married?");
        boolean ifMarried = scan.nextBoolean();

        String contact = ("work phone number - " + workPhone + ", personal phone number - " + personalPhone + ", email: " + email);
        String fullName = (lastName + ", " + firstName);
        String address = (street + ", " + city + ", " + state + " " + zip);

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contact);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + ifMarried);



    }
}