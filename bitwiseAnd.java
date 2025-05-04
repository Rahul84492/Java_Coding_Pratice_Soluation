import java.util.Scanner;

public class bitwiseAnd {
    public static void main(String[] args) {
        System.out.println("Showcasing the  bitwise And  operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number = input.nextInt();
        System.out.print("Plzz Enter the Second Number: ");
        int Number1 = input.nextInt();
        int result = number & Number1;
        System.out.println("Result is: "+result);
    }
}
