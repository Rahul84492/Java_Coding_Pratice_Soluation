import java.util.Scanner;

public class perimeterRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome! to Calculate the perimeter of a rectangle ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        float num1=input.nextFloat();
        System.out.print("Enter the Width: ");
        float num2=input.nextFloat();
        

        float rectangle = 2*(num1+num2);
        System.out.println("Perimeter of a Rectangle: "+ rectangle);
    }
}
