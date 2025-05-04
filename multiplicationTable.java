import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to print Multiplication Table ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int num = input.nextInt();
        int i=1;
        while(i <= 10)
        {
            int result = (i*num);
            i++;
            System.out.println(result);
        }
       
    }
}
