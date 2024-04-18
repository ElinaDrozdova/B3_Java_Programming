package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
double giftCardBalance = 200;
double item1 = 100;

double item2 = 40;
        System.out.println("Buy item 1 for $" + item1);
       // giftCardBalance = giftCardBalance - item1; //same
        giftCardBalance -=item1; //using SHORTHAND operator
        System.out.println("After purchasing item1, my gift card balance is $" + giftCardBalance);
giftCardBalance -= item2;
        System.out.println("After purchasing item2, my gift card balance is $" + giftCardBalance);
    }
}