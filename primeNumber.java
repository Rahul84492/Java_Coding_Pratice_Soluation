import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to check Prime NUmber");
        Scanner input = new Scanner(System.in);
        System.out.print("PLease Enter the Numner:");
        int num = input.nextInt();
        if(num <=1){
            System.out.println(num + "is not a prime number.");
        }
       else{
        boolean isPrime = true;
        int i =2;
        while (i<num) {
            if (num % i ==0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }
        
       }
    }
    
}