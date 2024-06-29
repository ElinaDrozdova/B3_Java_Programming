package practice_programming.day06_tasks;

public class GiftCard {
    public static void main (String []args){
        double item1 = 40;
        double item2 = 100;
        double cardBalance = 200;
        double remainingBalance = cardBalance - item1 - item2;

        System.out.println("The gift card started with a card balance of $" +  cardBalance + " and after buying item1 for $" + item1 + " and item2 for $" + item2 + ", " + "the remaining balance of the gift card is $" + remainingBalance);

    }
}
