package java8;

public class ConstructorMethodReference {

    public ConstructorMethodReference(String Msg){
        System.out.println(Msg);
    }

    public ConstructorMethodReference() {
        System.out.println("New Message: Constructor method reference");
    }

    public static void main(String[] args){
        Sayable sayable = ConstructorMethodReference::new;
        sayable.say();
    }

}
