package practice_programming.day05_tasks;


public class EmployeeInfo {
    public static void main (String []args) {
        String firstName = "James";
        String lastName = "Bond";
        char gender = 'M';
        int age = 40;
        String companyName = "M16";
        boolean areTheFullTime = true;
        String jobTitle = "Special Agent";
        int salary = 1000000;
        int pto = 15;
        boolean areTheyMarried = false;
        char suite = 'D';

        System.out.println("Employment information for " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println(jobTitle + "at " + companyName);
        System.out.println("Currently " + age + " years old");
        System.out.println(companyName + " is located in suite " + suite);
        System.out.println("This years salary comes to $" + salary);
        System.out.println("Other details:");
        System.out.println("\tPTO: " + pto);
        System.out.println("\tFull time? " + areTheFullTime);
        System.out.println("\tMarried? " + areTheyMarried);
    }
}

