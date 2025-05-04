import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {
        System.out.println("Welcome to print the Categorize ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
     String result = num>80 ? "High": (num>50 ? "Modrate" : "Low");
        System.out.println(result);
    }
}
