import java.util.Arrays;
import java.util.List;

public class swapsElementsArraysList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(6,9,7,5,8,2,1,9,5,6,3);
        System.out.println("old list "+list);
        list.set(5, 9);
        
        list.set(0, 1);
        System.out.println(list);
    }
}
