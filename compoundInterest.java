import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculate Compound Interest ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        double p = input.nextDouble();
        System.out.print("Enter the time: ");
        float t = input.nextFloat();
        System.out.print("Enter the rate: ");
        float r = input.nextFloat();

        double result = p* Math.pow((1+r/100),t);
        System.out.println("Compound Interest "+ result);


    }
}
