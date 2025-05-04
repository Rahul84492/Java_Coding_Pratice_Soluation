import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to print Factorial of given number");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        long num = input.nextLong();
        int i = 1;
        long x=1;
        if (num==1 || num ==0) {
            System.out.println("Factorial: "+ num );
          }
        while (i<=num) {
            x=(x*i);
          
          i++;
        }
        System.out.println("Factorial "+ num + " is: " + x);
        
    }
    
}
