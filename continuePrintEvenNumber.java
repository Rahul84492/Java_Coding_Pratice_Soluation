import java.util.Scanner;

public class continuePrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Print All Even Number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        for(int i=2; i<=num; i++){
            if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
