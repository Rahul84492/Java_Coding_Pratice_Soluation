import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to print Armstrong Number");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int num = input.nextInt();
        boolean isArmStrong = isArmStrong(num);
        if (isArmStrong) {
            System.out.println("your Number is Armstrong");
        }
        else{
            System.out.println("your Number is not ArmStrong");
        }

    }
    public static boolean isArmStrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber =0;
        while (num > 0) {
            int lastDigit = num %10;
            num /=10;
            finalNumber +=pow(lastDigit, noOfDigits);

            
        }
        return finalNumber == numCopy;
    }
    public static int pow(int num1,int num2){
        int result =1;
        int i =1;
        while (i<num2) {
            result *= num1;
            i++;
            
        }
        return result;

    }
    public static int noOfDigits(int num){
        int digit=0;
        while (num > 0) {
            digit++;
            num /=10;
        }
        return digit;
    }

}
