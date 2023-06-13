package threadEx;

public class GarbageCollection {

    protected void finalize(){
        System.out.println("Object is garbage collected.");
    }
    public static void main(String[] args){
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();

        g1 = null;
        g2 = null;
        System.gc();
    }
}
