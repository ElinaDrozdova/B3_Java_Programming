package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int t = 100;
       // int p = - ++t * -t-- / t++ + --t; //- making negative is higher priority!
        ++t; //101
        System.out.println(t--); // use - 101; update 100
t++; //101
        System.out.println(--t); //update - 100; use - 100
        System.out.println("t: " +t);
}
    }