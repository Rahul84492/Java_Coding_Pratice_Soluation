import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to print the Area of traingle ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of Base in cms: ");
        int Base = input.nextInt();
        System.out.print("Enter the Value of height in cms: ");
        int height = input.nextInt();

        int Area = (Base*height)/2;

        System.out.println("Area of traingle: "+ Area+ " cms");
    }
}
