import java.util.Scanner;

public class bitwiseLeft {
    public static void main(String[] args) {
        System.out.println("welcome to showcasing the Left shift OPerator:");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num = input.nextInt();
        int result = num<<1;
        System.out.println("result is: "+ result);
    }
}
