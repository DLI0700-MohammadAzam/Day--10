package ThreadCreation;

public class Task implements Runnable {
    String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "is being executed " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name + " is completed");
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                '}';
    }
}
