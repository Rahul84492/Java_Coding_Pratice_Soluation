import java.util.Scanner;

public class bitwiseXor {
    public static void main(String[] args) {
        System.out.println("Welcome to showcasing the XOR operatr");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num = input.nextInt();

        System.out.print("enter the Second Number: ");
        int num1 = input.nextInt();

        int result = num ^ num1;
        System.out.println("Result is: "+ result);
    }
}
