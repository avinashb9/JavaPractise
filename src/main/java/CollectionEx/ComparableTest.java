package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(123,"Yadav",29));
        list.add(new Student(103,"Vimal",27));
        list.add(new Student(100,"Kamal",25));
        System.out.println("Before Sort:");
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        Collections.sort(list);
        System.out.println("After Sort:");
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }



    }
}
