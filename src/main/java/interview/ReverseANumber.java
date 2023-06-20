package interview;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseANumber {

    public static void main(String[] args) {

//        int number = 45121;
        int number = 4314121;
//        System.out.println(reverseUsingArray(number));
        System.out.println(usingStreams(number));
    }

    public static int reverseUsingArray(int number){
        char[] numberChars = String.valueOf(number).toCharArray();
        int len = numberChars.length;
        for (int i =0,j=len-1;i<numberChars.length/2;i++,j--){
            if(numberChars[i] != numberChars[j]){
                char temp = numberChars[i];
                numberChars[i] = numberChars[j];
                numberChars[j] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: numberChars){
            sb.append(ch);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int usingStreams(int number){
        List<Character> numChars = String.valueOf(number).chars().mapToObj(ch -> (char)ch).collect(Collectors.toList());
        Collections.reverse(numChars);
        StringBuilder sb = new StringBuilder();
        numChars.forEach(sb::append);
        return Integer.parseInt(sb.toString());
    }
}
