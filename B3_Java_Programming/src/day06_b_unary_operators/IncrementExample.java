package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println (x);

        x= x +1; // 1 took the value of x which is 0and then added 1 on it ---- x=1;

        x++; //POST INCREMENT - increase it by only 1
        System.out.println (x); //2
        ++x; //PRe INCREMENT - increase it by only 1
        System.out.println (x); //3
        System.out.println (++x); // 4 ---- because its PRE INCREMENT, it will increase it first and print out
        //before used x=4
        System.out.println (x++); //4 --- because its POST INCREMENT , it will be used first and then increment ===== x=5 теперь, если мы его распечатаем ПОСЛЕ этой операции
        //after update x=5
        System.out.println (x); //5
    }
}