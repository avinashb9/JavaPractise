package threadEx;

public class ImplementThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new ImplementThread();
        Thread t1 = new Thread(r1,"Implement Thread");
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
    }
}
