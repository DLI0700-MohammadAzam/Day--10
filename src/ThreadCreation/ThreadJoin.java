package ThreadCreation;

public class ThreadJoin extends Thread{

    @Override
    public void run() {
        for(int i =0 ; i<2; i++)
        {
            try{
                Thread.sleep(1000);
                System.out.println("The current thread name is "+Thread.currentThread().getName());
            }catch (InterruptedException e)
            {
                System.out.println(""+e);
            }
            System.out.println(i);
        }
    }
}

class ThreadJoinExample
{
    public static void main(String[] args) {
        ThreadJoin t1 =new ThreadJoin();
        ThreadJoin t2 =new ThreadJoin();
        ThreadJoin t3 =new ThreadJoin();

        t1.start();
        try{
            System.out.println("The current thread is "+Thread.currentThread().getName());
            t1.join();
        }catch (InterruptedException e)
        {
            System.out.println(""+e);
        }
        t2.start();
        try{
            System.out.println("The current thread is "+Thread.currentThread().getName());
            t2.join();
        }catch (InterruptedException e)
        {
            System.out.println(""+e);
        }
        t3.start();
        System.out.println("the current thread is "+Thread.currentThread().getName());
    }

}