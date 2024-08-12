package ThreadSleep;

public class SleepExample extends Thread{

    @Override
    public void run() {
        for (int i =1; i<=5; i++)
        {
            try{
                if(i==4)
                    throw new InterruptedException("Thread Interrupted");
                System.out.println(i);
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(" "+e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        SleepExample t2 = new SleepExample();
        t1.start();
        t2.start();
    }
}
