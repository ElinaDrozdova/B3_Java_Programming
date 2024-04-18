package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
int b = 10;
b++; //increased by 1. just standalone statement to increase value by 1
System.out.println(b); //1 action - we print the value of b
        b--; //b = b-1; post decrement, just standalone statement to decrease value by 1
        System.out.println(b);
        System.out.println(b++); //2 actions^ print and update. если пост, то сначала напечатать, потом обновить ддобавить. 1st - use, 2nd - update
        System.out.println(b--); // 11. 1st - use, 2nd - update 11 -1 =10
    }
}