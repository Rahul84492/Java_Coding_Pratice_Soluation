import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class sleepTask implements Runnable {
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread: %s\n", current.getName());
        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with Thread: %s\n", current.getName());
    }

    private int getRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            sleepTask task = new sleepTask();
            service.submit(task);
        }
        service.shutdown();
    }
}
