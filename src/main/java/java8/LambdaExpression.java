package java8;

public class LambdaExpression {

    public static void main(String[] args){
        Sayable sayable = () -> {
            System.out.println("I have nothing to say");
        };
        sayable.say();

    }
}
