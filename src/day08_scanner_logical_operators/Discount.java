package day08_scanner_logical_operators;

public class Discount {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFirefighter = false;
         boolean isEligible = isWeekend && (isTeacher || isOfficer || isFirefighter ); //если есть скобки! то проиграет вторую часть выражения
         //                                   false || true || false
        //                    true            ||false
        //                             true
        System.out.println(isEligible);
    }
}