import java.util.Scanner;

public class sumOddNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to print sum of all odd ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value You Want to sum: ");
        int num = input.nextInt();
       int sum = 0;
      int i = 1;
      while (i<=num) {
        if (i % 2 !=0) {
           System.out.print(i+"\t");
            sum = sum+i;
            
        }
        i++;
        
    
     
      }
      System.out.print("sum of all odd number up to "+ num + " is: "+ sum);
    }
    
}
