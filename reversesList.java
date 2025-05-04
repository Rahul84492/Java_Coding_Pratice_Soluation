import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reversesList {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverses the list ");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        System.out.println("old List: "+list);
        Collections.reverse(list);
        System.out.println("new List"+list);
    }
}
