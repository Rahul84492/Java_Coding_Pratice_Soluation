import java.util.Scanner;

public class lcmTwoNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Find the LCM");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num = input.nextInt();
        System.out.println("Please Enter the Second Number: ");
        int num2= input.nextInt();
        int i =1;
        while (i<=num2) {
            int factor = num*i;
            if (factor % num2==0) {
                System.out.println(factor);
            }
            i++;
        }
    }
}
