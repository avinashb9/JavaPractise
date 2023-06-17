package StreamEx;

import java.util.Arrays;
import java.util.List;

public class AverageInt {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,56,45,1,3,4,12,33);
        double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
        System.out.println(avg);
    }
}
