import java.util.Scanner;

public class sumOfDigit {

    public static void main(String[] args) {
        System.out.println("Welcome to sum of digit ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: " );
       int num = input.nextInt();
       int x=0;
       int sum =0;
       while (num >0){
         sum = sum + num % 10;
         num = num  /10;
       }
       System.out.println(sum);
    }
}