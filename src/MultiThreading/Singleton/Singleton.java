package MultiThreading.Singleton;

public class Singleton extends Thread {

    private static Singleton instance;
    private Singleton()
    {

    }
    static Singleton getInstance()
    {
        if(instance == null)//4- threads t1,t2,t3,t4
            synchronized (Singleton.class){
            if(instance == null)
                instance = new Singleton();
            }


        return instance;
    }

    public void print()
    {
        System.out.println("asdfg");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread("Thread-1"){
            @Override
            public void run() {
                Singleton obj1 =Singleton.getInstance();// inst
                System.out.println(obj1.hashCode());
            }
        };

        Thread t2 = new Thread("Thread-1"){
            @Override
            public void run() {
                Singleton obj2 =Singleton.getInstance();// inst
                System.out.println(obj2.hashCode());
            }
        };
        t2.start();
        t1.start();

    }
}
