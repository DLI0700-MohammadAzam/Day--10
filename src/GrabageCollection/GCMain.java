package GrabageCollection;

public class GCMain {public static void main(String[] args) {
    GCDemo obj1 = new GCDemo("1");
    GCDemo obj2= new GCDemo("2");
    GCDemo i = new GCDemo("3");


    obj1 = null;
    obj2 = i;


    System.gc();

    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
