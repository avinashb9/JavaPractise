package java8;

public class MethodReference {

    public static void saySomething(){
        System.out.println("Say Something...");
    }

    public static void main(String[] args){
        Sayable sayable = MethodReference::saySomething;
        sayable.say();
    }
}
