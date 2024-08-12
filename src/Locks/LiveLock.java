package Locks;

public class LiveLock {

        private static boolean sharedResource = false;

        public static void main(String[] args) {
//             int i =0;
            Thread thread1 = new Thread(() -> {
                while (!sharedResource ) {

                    System.out.println("Thread 1 waiting...");



                    // Simulate some work

                }
                System.out.println("Thread 1 done!");
            });

            Thread thread2 = new Thread(() -> {
                while (!sharedResource) {
                    System.out.println("Thread 2 waiting...");
                    // Simulate some work


                }
                System.out.println("Thread 2 done!");
            });

            thread1.start();
            thread2.start();

            // Oops! Both threads are too polite to grab the resource.
            // They keep yielding to each other, but nothing happens.
            // Livelock achieved!
        }
    }


