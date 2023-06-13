package threadEx;

public class CustomThread extends Thread{

    public void run(){
        System.out.println("Current state: "+this.getState());
        System.out.println("Thread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        CustomThread t1 = new CustomThread();
        t1.setName("Custom Thread");
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
