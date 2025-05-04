import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class printNumber implements Runnable {
    public void run(){
        for (int i=0; i<10; i++){
            System.out.printf("Number is %d\n", i+1);
        }
    }
    public static void main(String[] args) {
       ExecutorService service = Executors.newSingleThreadExecutor();
        printNumber task = new printNumber();
        service.submit(task);
    }
}
