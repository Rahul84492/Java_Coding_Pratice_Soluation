import java.util.List;
import java.util.stream.Stream;

public class streamOdd {
    
        public static void main(String[] args) {
            List<Integer> list = List.of(52,5,41,89,36,75,22,44,32,26,93,66);
            list.stream()
                .filter(num -> num % 2 ==1)
                .forEach(System.out::println);
        }
    }