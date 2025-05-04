import java.util.Scanner;

public class swapNumber {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Welcome to Swapping two Number\n");
     System.out.println("Enter the First Number: ");
     int num1= input.nextInt();
     System.out.println("Enter the Second Number: ");
     int num2=input.nextInt();
     int temp=num1;
      num1=num2;
      num2=temp;System.out.println("Swapping Done:- ");
      System.out.println("First Number: "+ num1);
      System.out.println("Second number: "+ num2);


    }
}