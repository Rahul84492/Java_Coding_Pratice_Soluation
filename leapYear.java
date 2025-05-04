import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to Check Leap Year or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int Year = input.nextInt();
        if (Year % 4 ==0 && Year % 100 !=0) {
            System.out.println("Enter the Year is Leap Year: " + Year);
        }
            else if(Year % 400 ==0){
                System.out.println(" you year is Leap Number: ");
            }
            else{
                System.out.println( " your year is not Leap Year: ");
            }
        
    }
}
