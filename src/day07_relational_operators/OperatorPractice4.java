package day07_relational_operators;

public class OperatorPractice4 {
    public static void main(String[] args) {
        int t = 100;
        int p = -++t * -t-- / t++ + --t; //-101 * -100 / 100 ( update 101) + 100 ----->
        //                                  10201 / 100
        //                                   102+100 = 202
        System.out.println(t);
        System.out.println(p);

    }
}