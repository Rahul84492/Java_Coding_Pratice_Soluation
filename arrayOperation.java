import java.util.Arrays;

public class arrayOperation {
    private int[] numbers;

    
    public arrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    
    public class Statistics {

        
        public double getMean() {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

        
        public double getMedian() {
            int[] sorted = numbers.clone();
            Arrays.sort(sorted);
            int n = sorted.length;
            if (n % 2 == 0) {
                return (sorted[n/2 - 1] + sorted[n/2]) / 2.0;
            } else {
                return sorted[n/2];
            }
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        arrayOperation arrayOps = new arrayOperation(arr);
        Statistics stats = arrayOps.new Statistics();

        System.out.println("Mean: " + stats.getMean());
        System.out.println("Median: " + stats.getMedian());
    }
}
