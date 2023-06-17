package propertiesEx;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemProperties {

    public static void main(String[] args){
        Properties prop = System.getProperties();
        Set<Map.Entry<Object, Object>> set = prop.entrySet();
        Iterator<Map.Entry<Object,Object>> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
