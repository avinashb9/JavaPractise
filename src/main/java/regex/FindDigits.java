package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDigits {

    /* Qualizeal interview question: retrieve digits and date from string*/
    public static void main(String[] args) {
        String str = "Order number 11223344 generated on 3-May";
        String digitsRegex = "\\d{2,}";
        String dateRegex = "\\d-\\w+";
        //find number
        Matcher matcher = Pattern.compile(digitsRegex).matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        //find date
        matcher = Pattern.compile(dateRegex).matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
