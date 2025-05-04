import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Welcome to Check number is  Even or odd Number");
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter the number: ");
        int number = input.nextInt();
        if (number % 2 ==0) {
            System.out.println( number +" is Even Number " );
            
        }
        else{
            System.out.println(number+" is Odd Number " );
        }

    }
}
