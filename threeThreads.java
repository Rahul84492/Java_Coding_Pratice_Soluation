public class threeThreads {

    private  final int threadNumber;
    public threeThreads(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run(){
        
    System.out.printf( "Thread Start %d%n",Thread.currentThread().getName(),threadNumber );
        
    }

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        throw new RuntimeException(e);
    }
}

