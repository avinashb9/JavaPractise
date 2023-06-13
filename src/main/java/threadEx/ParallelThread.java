package threadEx;

public class ParallelThread extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
        System.out.println(this.getName()+" - running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ParallelThread p1 = new ParallelThread();
        p1.setName("P1");
        ParallelThread p2 = new ParallelThread();
        p2.setName("P2");
        System.out.println("p1 - "+p1.getState());
        System.out.println("p2 - "+p1.getState());
        p1.start();
        p2.start();
        System.out.println("p1 - "+p1.getState());
        System.out.println("p2 - "+p1.getState());
        p1.join();
        p2.join();
        System.out.println("p1 - "+p1.getState());
        System.out.println("p2 - "+p1.getState());
    }
}
