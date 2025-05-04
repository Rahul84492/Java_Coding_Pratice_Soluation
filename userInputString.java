import java.util.Scanner;

public class userInputString {
    public static void main(String[] args) {
        System.out.println("Concatenatee the Two String ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String r = input.next();
        System.out.print("Please Enter the Second String: ");
        String s = input.next();

        String Result = r+s;

        System.out.printf(" %S ", Result);

    }
}
