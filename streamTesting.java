import java.util.List;

public class streamTesting {
    public static void main(String[] args) {
        List<String> list = List.of("Rahul","Sejal","Prince");
        list.stream();
        
        for(String names:list){
            System.out.println(names);
        }
    }
}
