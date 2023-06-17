package CollectionEx;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

public class SortByKeys {

    public static void main(String[] args){
        Map<Integer,String> students = new HashMap<>();
        students.put(133,"Amit");
        students.put(100,"Arun");
        students.put(122,"Prameel");
        System.out.println("Before sorting:");
        students.entrySet().forEach(System.out::println);
        System.out.println("After sorting by keys:");
        students.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("After sorting by Values:");
        students.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("After sorting by keys in Descending order:");
        students.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("After sorting by Values in Descending order:");
        students.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
