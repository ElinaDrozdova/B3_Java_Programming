package day10_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Hello World!"); //Since if condition is False, the code block that belongs to if statement will not be executed
        }
        System.out.println("Second Print Statement");
        if (true) {
            System.out.println("Today is Wednesday");
        }
        int score = 60;
        if (score >=75){
            System.out.println("Passing the exam");
        }
        if (score <75){
            System.out.println("Faliling the exam");

        }
        int year = 2021;
        boolean isLockdown = year==2020 || year ==2021; //true=true

        if (isLockdown){
            System.out.println("Stay at home");
            System.out.println("Practice Coding");
        }
    }
}
