import java.util.Scanner;

public class bitewiseRightMost{
    public static void main(String[] args) {
        System.out.println("welcome to showcasing the right most Operator:");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number:");
       int num = input.nextInt();
       int result = num >> 1;
       System.out.println("Result is "+ result); 
    }
}
