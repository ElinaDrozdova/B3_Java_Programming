package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {
boolean isRain = false;
int temperature = 60;


        System.out.println("Go for a walk: " + (!isRain &&temperature >70) ); //parentesis need for priority
    }
}
