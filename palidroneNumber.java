import java.util.Scanner;

class palidroneNumber{
    public static void main(String[] args) {
        System.out.println("Welcome to print the Palidrone Number");
        Scanner input = new Scanner(System.in);
        System.out.print("PLease Enter the number: ");
        int num = input.nextInt();
        boolean isPalidrone = isPalidrone(num);
        if (isPalidrone) {
            System.out.println("your number is palidrone: ");

        }else{
            System.out.println("Your Number is Not Palidrone: ");
        }
    
        

    }
    public static boolean isPalidrone(int num){
        return num==reverse(num);
    }
    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
}