import java.util.Scanner;

public class circumferenceUsingMath {
    public static void main(String[] args) {
        System.out.println("Calculate the Area And Circumference of a circle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius Value: ");
        int Radius = input.nextInt();
         
        double Circumference   = (2*Radius*Math.PI);
        double Area = (Math.PI*Radius*Radius);
        System.out.printf("Circumference: %.2f\n", Circumference);
        System.out.printf("Area: %.2f\n", Area);

    }
}
