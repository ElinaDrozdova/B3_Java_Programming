package practice_programming.day15_tasks;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print username");
        String userName = input.next();
        System.out.println("Print password. Password cannot be less than 5 characters");
        String password = input.next();



        if (password.length() < 5) {
            System.out.println("Invalid password");
        } else if  (password.length() >=5) {
            if (password.contains(userName)==true){
        System.out.println("Invalid password, username should not be in it");

    } else{
        System.out.println("Valid password");
    }
}
}
        }


/*Task #7 - UserAndPass

    Create a class called UserAndPass in your Practice_Programming project and inside the p_p.day15_tasks package

        Task:
                Given a username and password verify they are valid.
                    -The password cannot be less than 5 characters
                        If it is less print: "Password cannot be less than 5 characters"
                        If it is more than or equal to 5 print: "Valid password"
                    -Also,the password should not contain the username
                        -If the password has the username in it print:
                            "Invalid password, username should not be in it"
                                Also change the password to have the value: "password" */