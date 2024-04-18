package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        int a = 10;
        a = 11; //re-assigning a new value to a
        a++; //re-assigning a new value to a which increased by 1 (post increment)
        ++a; //re-assigning a new value to a which increased by 1 (pre increment)
        a = a +1; //re-assigning a new value to a which increased by 1 (regular adding 1)

        // add 10
        a = a + 10;
        a += 10; //shorthand operator
        System.out.println(a); //34

        int b = 2;
        b*=6;
        System.out.println(b);

        int c = 10;
        c %= 3;
        System.out.println(c); //1



    }
}