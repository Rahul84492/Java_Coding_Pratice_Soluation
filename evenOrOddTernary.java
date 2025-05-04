import java.util.Scanner;

public class evenOrOddTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to find the even or odd using the ternary operator ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int num = input.nextInt();
        String result = (num%2==0) ? "even number":"odd number";
        System.out.println(num + " is "+result);
    }
}
