package day08_scanner_logical_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int ageOfPerson = 13;
        boolean isKid = ageOfPerson <= 13;
        boolean isSenior = ageOfPerson >= 65;
        System.out.println("The person is kid " + isKid);
        System.out.println("The person is senior " + isSenior);


    }
}