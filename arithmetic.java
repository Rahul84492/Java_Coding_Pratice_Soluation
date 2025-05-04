import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = input.nextInt();

        int add= num1+num2;
        System.out.println("Addtion: "+ add);

        int sub= num1-num2;
        System.out.println("Substraction: "+ sub);

        int multi= num1*num2;
        System.out.println("Multiplication: "+ multi);

        int div=num1/num2;
        System.out.println("Divide: "+ div);

        int modu = num1%num2;
        System.out.println("Moduls: "+ modu);
    }
}
