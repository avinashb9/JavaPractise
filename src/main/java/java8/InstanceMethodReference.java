package java8;

public class InstanceMethodReference {

    public void printMsg(){
        System.out.println("print MSG... Non static method");
    }

    public static void main(String[] args){
        InstanceMethodReference imr = new InstanceMethodReference();
        Sayable sayable = imr::printMsg;//instance method reference
        sayable.say();

    }
}
