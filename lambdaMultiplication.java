import java.util.function.BinaryOperator;

public class lambdaMultiplication {
    
        public static void main(String[] args) {
            BinaryOperator<Integer> multi= (a,b)-> a*b;
            int result = multi.apply(5, 4);
            System.out.println(result);
        }
    }