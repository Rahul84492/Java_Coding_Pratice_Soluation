import java.util.Scanner;

public class Pattrens {
    public static void main(String[] args) {
        System.out.println("Welcome to print the  Pattrens");
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter the number:");
        int num = input.nextInt();
        int i=0;
        while (i<=num) {
            System.out.print(" *");
           
            int j=1;
            while (j<=i) {
                System.out.print(" *");
                j++;
            }
            
            i++; 
            System.out.println();
        }
          
       
    }
}
