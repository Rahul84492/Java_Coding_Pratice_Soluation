import java.util.Scanner;

public class exitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       

        while (true) {
            System.out.println("Enter the Number ");
            String num = input.next();
            if (num == "exit") {
                break;
            }
        }
        System.out.println("You Have Succesfully  exited ");
    }
}
