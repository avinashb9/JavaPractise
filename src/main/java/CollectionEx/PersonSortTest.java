package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PersonSortTest {

    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        list.add(new Person(123,"Yadav",25));
        list.add(new Person(103,"Vimal",23));
        list.add(new Person(100,"Kamal",28));
        System.out.println("Before Sort:");
        Iterator<Person> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        Collections.sort(list,new AgeComparator());
        System.out.println("After Sorting By Age:");
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }

        Collections.sort(list,new NameComparator());
        System.out.println("After Sorting By Name:");
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}
