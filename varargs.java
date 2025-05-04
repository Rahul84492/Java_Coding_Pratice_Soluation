public class varargs {
     
    public static void main(String[] args) {
        System.out.println(concatenate("Rahul"));
        System.out.println(concatenate("Sakshi"));
        System.out.println(concatenate("Khushi"));
    }
public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
