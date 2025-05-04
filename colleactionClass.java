import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class colleactionClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,9,6,3,7,5,2,8,9,2,9,2);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
    }
}
