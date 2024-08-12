package ThreadCreation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <= 10; i++) {
            Task task = new Task("Task_" + i);
            System.out.println("Submitting task  ");
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
