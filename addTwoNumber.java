import java.util.Scanner;

public class addTwoNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Add Two Number");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the First Number:");
        int num1= input.nextInt();
        System.out.println("Enter the  Second Number:");
        int num2 = input.nextInt();
        int add=num1+num2;
System.out.println("This is your Two Number Addtion: "+add );
    }
}
