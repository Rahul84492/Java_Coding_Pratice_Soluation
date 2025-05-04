import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculate to Simple Interest ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        double p = input.nextDouble();
        System.out.print("Enter the Rate:");
        int r = input.nextInt();
        System.out.print("Enter the time: ");
        int t = input.nextInt();

        double result = (p*r*t)/100;

        System.out.println("Simple Interest: "+ result);
    }
}
