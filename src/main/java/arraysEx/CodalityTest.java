package arraysEx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodalityTest {

    public static void main(String[] args) {
//        int[] A = {1, 3, 6, 4, 1, 2};
        int[] A = {-1, -3};

        //sort array
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        //find min

        //find max
        int max = A[A.length-1];
        System.out.println(max);
        if(max < 0 ){
            System.out.println("missing - 1");
        }else {
            List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
            for(int i = A[0];i<A.length;i++){
                if(!(numbers.contains(i))){
                    System.out.println("missing: "+i);
                    break;
                }
            }
        }

        //iterate min to max and check for gaps



    }
}
