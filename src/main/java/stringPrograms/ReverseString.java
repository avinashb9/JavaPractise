package stringPrograms;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

    //reverse a string
    public static void main(String[] args) {
        String name = "Avinash";
        String reverse = StringUtils.reverse(name);
        System.out.println(reverse);
//        String reverse = Arrays.stream(new char[]{name.toCharArray()}).map(ch -> (char)ch).collect(Collections.reverseOrder()).toString();

        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.reverse());
    }
}
