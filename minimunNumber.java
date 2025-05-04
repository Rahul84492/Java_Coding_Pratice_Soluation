import java.util.Scanner;

public class minimunNumber {
public static void main(String[] args) {
    System.out.println("Welcome to find the minimum number");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the First number:");
    int num = input.nextInt();
    System.out.print("enter the Second number: ");
    int num1= input.nextInt();
    int min= (num<num1) ? num:num1;
     System.out.print("Min number is:"+min);
}
}
