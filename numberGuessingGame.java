import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing game: ");
        Scanner input = new Scanner(System.in);
       int num = 5, Guess;
        do{
            System.out.println("please Guess the number 0-10 ");
             Guess = input.nextInt();
        }while(num !=Guess);
        System.out.println("You Have Successfully Gussed the number ");
    }
}
