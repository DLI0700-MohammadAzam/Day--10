package ThreadCreation;

public class UsingRunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread running through Runnable");
    }

    public static void main(String[] args) {
        UsingRunnableClass r1 = new UsingRunnableClass();

        Thread t2 = new Thread(r1);
        t2.start();

    }
}
