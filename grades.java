import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        System.out.println("Welcome to print Grades");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the Percentage: ");
        int Marks = input.nextInt();
        if(Marks >= 90){
            System.out.println("Your have got A");
        }
        else if( Marks >= 75){
            System.out.println("Your have got B");
        }
        else if (Marks >= 60){
            System.out.println("Your have got C");
        }
        else if(Marks >= 30){
            System.out.println("Your have got D");
        }
        else if(Marks >= 30){
            System.out.println(" Your have got E");
        }
        else{
            System.out.println("You Fail! Work Hard");
        }
    }
}
