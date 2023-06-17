package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{

    private Integer Id;
    private String name;
    private Integer age;

    public Student(Integer id, String name, Integer age) {
        this.Id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
