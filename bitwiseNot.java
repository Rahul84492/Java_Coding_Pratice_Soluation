import java.util.Scanner;

public class bitwiseNot {
    public static void main(String[] args) {
        System.out.println("Showcasing the not Operaor: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("Result is: "+ result);
    }
}
