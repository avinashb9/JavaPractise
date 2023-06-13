package threadEx;

public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("First Thread");
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        t1.run();
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
    }
}
