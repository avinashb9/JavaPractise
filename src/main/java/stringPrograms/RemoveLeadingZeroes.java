package stringPrograms;

public class RemoveLeadingZeroes {

    public static void main(String[] args){
        String str = "000435045005";
        char[] charArr = str.toCharArray();
        boolean flag = true;
        StringBuffer sb = new StringBuffer();
        for(char ch: charArr){
            if(flag && ch == '0') {
                continue;
            }else{
                flag = false;
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
