package ThreadCreation;

public class UsingThreadAndRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This is created using Thread class and Runnable interface");
    }

    public static void main(String[] args) {
        Runnable r1 = new UsingThreadAndRunnable();
        Thread th1 = new Thread(r1,"My new Thread");
        th1.start();
        System.out.println(th1.getName());
    }
}
