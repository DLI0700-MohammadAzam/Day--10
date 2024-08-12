package ThreadCreation;

public class UsingThreadClass {
    public static void main(String[] args) {
        Thread t3 = new Thread("Thread1");
        t3.start();
        t3.setPriority(10);
        System.out.println(t3.getPriority());
        System.out.println(t3.getName());
    }
}
