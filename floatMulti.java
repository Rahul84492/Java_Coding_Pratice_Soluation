import java.util.Scanner;

public class floatMulti {
    public static void main(String[] args) {
        System.out.println("Welcome to Floating point Number Multiplication ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        float num1= input.nextFloat();
        System.out.print("Enter the Second Number: ");
        float num2= input.nextFloat();

        float result = num1*num2;
        System.out.println("Here is the Floating Point Number Multiplication: "+ result);

    }
}
