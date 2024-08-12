package ThreadSleep;

public class SleepNegetiveValue extends Thread{

    @Override
    public void run() {
        for(int i =1; i<=5;i++)
        {
            try{
                System.out.println(Thread.currentThread().getName()+"   "+i);
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(""+e);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Illegal ->"+e);
            }
        }
    }

    public static void main(String[] args) {
        SleepNegetiveValue t2 = new SleepNegetiveValue();
        t2.start();
        try{
        t2.start();}
        catch (IllegalThreadStateException e)
        {
            System.out.println(""+e);
        }
        SleepNegetiveValue t1 = new SleepNegetiveValue();
        t1.start();
    }
}