import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse the number ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int number = input.nextInt();
        int reverse=reverse(number);
        System.out.println("Reverse of your number is " + reverse);

    }
    public static int reverse(int number){
        int n = 0;
        while (number >0) {
            int digit = number %10;
            n = n*10+digit;
            number /=10;
            
            
        }
        return n;
    }
}
