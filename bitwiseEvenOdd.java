import java.util.Scanner;

public class bitwiseEvenOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to Check number Even or Odd Using Bitwise Operartor");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if ((num & 1) == 1){
            System.out.println("Your Number is odd");
        }
        else{
            System.out.println("Your Number is Even");
        }
    }
}
