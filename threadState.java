public class threadState extends Thread {
    public void run(){
        try{
            Thread.sleep(4000);
            System.out.printf("From inside run is %s %n ",Thread.currentThread().getState());
        }catch(InterruptedException exception){
        throw new RuntimeException(exception);
        }

    
    }
    public static void main(String[] args) throws InterruptedException{
        threadState t1 = new threadState();
        System.out.printf("From inside run is %s%n ",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("thread finished %s%n",t1.getState());
}
}