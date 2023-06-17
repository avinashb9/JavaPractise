package CollectionEx;

public class Person {

    public Integer Id;
    public String name;
    public Integer age;

    public Person(Integer id, String name, Integer age) {
        this.Id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
