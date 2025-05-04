import java.util.Scanner;

class posNegNumber{
    public static void main(String[] args) {
        System.out.println("Welcome to  Number Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int number = input.nextInt();
        if (number>0)
        {
         System.out.println("Enter number is postive: "+ number);
        }
        else if (number==0){
            System.out.println("Your Number is Zero: ");
        }
        else
        {
           System.out.println("Enter number is Negative: "+ number);
         }
        
    }
}