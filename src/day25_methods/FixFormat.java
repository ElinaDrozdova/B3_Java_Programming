package day25_methods;
import my_utilities.StringUtil;

/*
    Fix Format

    create a method will accept a String and return a String in proper format.
    Proper format is:
        First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixFormat {
    public static void main(String[] args) {

        String str = "MIcKy";
        System.out.println(  fixFormat(str)  ); // I called fixFormat() method which is in the same class

        System.out.println(StringUtil.fixFormat("loopCAMP"));

    }

    public static String fixFormat (String str) {

        String result = "";

        // result = (str.charAt(0)+"").toUpperCase() + str.substring(1).toLowerCase();
        result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

        return result;
    }
}