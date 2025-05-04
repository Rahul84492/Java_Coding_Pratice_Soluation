import java.util.Scanner;

public class forMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to pront the Multplication Table");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int num = input.nextInt();
        
        for(int i = 1; i<=10; i++){
            int result = num*i;
            System.out.println(num + " * "+ i+ " = "+result);
        }

    }
}
