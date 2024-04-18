package day08_scanner_logical_operators;

public class EligibleToWhat {

    public static void main(String[] args) {
 String name = "Tom Jerry";
 boolean isCitizen = true;
 boolean hasCriminal = false;
 int age = 49;
  boolean isEligible = age>=18 && isCitizen && !hasCriminal;
  //true&&true&&false
        //true&&true
        //true

        System.out.println(name + " is eligible to vote: " + isEligible);
        //person2
        String name2 = "Vinnie Pooh";
        boolean isCitizen2 = true;
        boolean hasCriminal2 = true;
        int age2 = 59;
        boolean isEligible2 = age2>=18 && isCitizen2 && !hasCriminal2;
        System.out.println(name2 + " is eligible to vote: " + isEligible2);

    }
}