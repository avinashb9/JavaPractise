package arraysEx;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {
        String[] names = {"Ajay","Ravi","Vinod","Kailash"};
        String name = "Avinash";

        Arrays.sort(names,Collections.reverseOrder());
        System.out.println(Arrays.toString(names));
    }
}
