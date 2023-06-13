package CollectionEx;

import java.util.*;

public class ListIteratorEx {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Ajay","Ravi","Vijay","Kailash");
        System.out.println("Iteration in revers order");
        ListIterator<String> li = list.listIterator(list.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("Iteration in actual order");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
