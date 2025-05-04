public class helloThread extends Thread {

    private final int threadNumber;

    public helloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.printf("Hello from Thread-%d%n", threadNumber);
        }
    }
    public static void main(String[] args) {
        helloThread t1= new helloThread(1);
        helloThread t2 = new helloThread(2);
        t1.start();
        t2.start();;
    }
  
}
