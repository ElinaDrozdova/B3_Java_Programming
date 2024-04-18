package day08_scanner_logical_operators;

public class ShortCurcuit {
    public static void main(String[] args) {

        System.out.println(true || 5/0 ==0); //shortcurcuit OR ||
        //true, деление на 0 не проверяет
       // System.out.println(true | 5/0 ==0); //OR | дает ошибку из-за деления на 0
        //ERROR
        System.out.println(false && 5/0 ==0); //shortcurcuit AND &&
      //  System.out.println(false & 5/0 ==0); // AND &

       int a = 0;

        System.out.println(false && a++ ==5); //shortcurcuit AND &&
        System.out.println(a); //0

        int b= 0;
        System.out.println(false & b++ ==5); //&
        System.out.println(b); //1 b изменился
    }
}