import java.util.Scanner;

public class simpleCalculatorSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to simple Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter the number ");
        int num = input.nextInt();
        System.out.println("Enter the Second Number: ");
        int num1= input.nextInt();
        System.out.println("Enter Any Char");
        String operation = input.next();
        switch (operation) {
            case "+": System.out.println("Addtion= " + (num+num1));
                
                break;
                case "-": System.out.println("Subtraction= " + (num-num1));
                break;

                case "*": System.out.println("Multiplication= " + (num*num1));
                
                break;
                case "/": System.out.println("Divsion= " + (num/num1));
                
                break;
            default:
            System.out.println("Enter a Valid Operation");
                break;
        }
    }
}
