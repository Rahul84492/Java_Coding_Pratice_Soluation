import java.util.Scanner;
class userInput{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Pls Enter the name:");
        String name = input.nextLine();
        System.out.println("Welcome "+ name +" to KG Coding");
    }
}