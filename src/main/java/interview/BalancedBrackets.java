package interview;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static void main(String[] args) {
//        String str = "([{]))";
		String str = "([{{[(())]}}])";
//        System.out.println("Is Balanced? : "+isBalanced(str));
        System.out.println(isBalancedUsingDeque(str));
    }

    /*This works for random and ordered closed and open brackets*/
    public static boolean isBalanced(String str){
        char[] chars = str.toCharArray();
        //if the chars count is not even
        if(!(chars.length%2 == 0)){
            return false;
        }

        for(char ch: chars){
            if(str.contains("{")){
                if(!str.contains("\\}"))
                    return false;
                else {
                    str.replaceFirst("\\{","");
                    str.replaceFirst("\\}","");
                }
            }
            else if(str.contains("[")){
                if(!str.contains("]"))
                    return false;
                else{
                    str.replaceFirst("\\[","");
                    str.replaceFirst("\\]","");
                }
            }
            else if(str.contains("(")){
                if(!str.contains(")"))
                    return false;
                else {
                    str.replaceFirst("\\(","");
                    str.replaceFirst("\\)","");
                }
            }
            if(str.length() == 0)
                break;
        }
        return (str.length() == 0);
    }

    /*This method works for order open and closed brackets like - ([{{[(())]}}]) */
    public static boolean isBalancedUsingDeque(String str){
        //LIFO approach
        Deque<Character> deque = new ArrayDeque<>();
        if(!(str.length()%2 == 0)){
            return false;
        }
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);

            if(x == '[' || x == '{' || x == '('){
                deque.push(x);
                continue;
            }
            char check = deque.pop();
            switch (x){
                case ')':
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    if(check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return (deque.isEmpty());
    }
}
