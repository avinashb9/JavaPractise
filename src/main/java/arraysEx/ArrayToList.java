package arraysEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Ajay","Ravi","Vinod","Kailash");
        String[] names = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(names));
        Arrays.stream(names).forEach(System.out::println);

        List<String> list1 = Arrays.asList(names);
        System.out.println(list1);

    }
}
