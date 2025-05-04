import java.util.Scanner;

public class fahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Welcome to Convert Fahrenheit to Celsius ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of fahrenheit: ");
        float f = input.nextFloat();

        double c = (f-32)*5/9;

        System.out.println("Celsius: "+ c +"C");
    }
}
