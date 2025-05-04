public class timeMili {
    public static void main(String[] args) {
        long StartTime= System.currentTimeMillis();
        for (int i = 0; i <=1000; i++) {
            System.out.printf("%d* ", i);
           
        }
        System.out.println("First task Complted \n");
        for (int i = 0; i <=1000; i++) {
            System.out.printf("%d$ ", i);
            
        }
        System.out.println("Second task Complted \n");
        for (int i = 0; i <=1000; i++) {
            System.out.printf("%d%% ", i);
           
        }
        System.out.println("Third task Complted \n");
        for (int i = 0; i <=1000; i++) {
            System.out.printf("%d& ", i);
           
        }
        System.out.println("Fourth task Complted \n");
        long EndTime= System.currentTimeMillis();
        System.out.printf("total time taken:%d ", (EndTime-StartTime));
    }
}
