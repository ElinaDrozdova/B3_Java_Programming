package day08_scanner_logical_operators;

public class AllOperators {
    public static void main(String[] args) {

        System.out.println(5 + 2 * 3); //11
        System.out.println(5*2 + 4/2); //12
        System.out.println(5+2>4-3); //7>1 true

        int a= 20;
        int b = -a-- + a++ + --a * a--;
        //-20 + 19 + 19 * 19
        //-20+19 + 361
        //-1+361
        //360
    }
}