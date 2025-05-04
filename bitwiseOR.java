import java.util.Scanner;

public class bitwiseOR {
    public static void main(String[] args) {
        System.out.println("Showcasing the OR Operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int num1 = input.nextInt();

        int result = num | num1;
        System.out.println("result is "+ result);
    }
}
