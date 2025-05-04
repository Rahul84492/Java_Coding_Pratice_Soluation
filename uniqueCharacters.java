import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter your String: ");
        String in = input.next();

        for(char ch : in.toCharArray()){
            unique.add(ch);
        }
        System.out.println("Your string has unique Char"+unique.size());
        
    }
}
