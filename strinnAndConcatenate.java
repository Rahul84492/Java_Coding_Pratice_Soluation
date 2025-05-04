import java.util.List;

public class strinnAndConcatenate {
    
        public static void main(String[] args) {
            List<String> list = List.of("Rahul Jayker","Sakshi Agrawal","Khushi Sharma","Ankur ","Parul kashyap");
        String result=    list.stream()
                .filter(str -> str.length()>10)
                .reduce(" ",(a,b)-> a+ " " +b);
                System.out.println(result);

        }
    }