import java.util.Scanner;

public class greatestThree {
    public static void main(String[] args) {
        System.out.println("Welcome to print the greatest number: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int Number = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int Number1 = input.nextInt();

        System.out.print("Enter the third Number: ");
        int Number2 = input.nextInt();

        if (Number >= Number1 && Number >= Number2) {
            System.out.println("First Number is Greatest Number: " + Number);
        }
     else if(Number1 > Number2){
        System.out.println("Second Number is greatest: "+ Number1);

     } 
     else{
        System.out.println("third number is Greatest: " + Number2);
     }
    }
}
