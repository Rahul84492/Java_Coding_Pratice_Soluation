import java.util.Scanner;

public class exceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first Number ");
        int first = input.nextInt();
        System.out.println("Please Enter the Second Number");
        int Second = input.nextInt();

        try{
            int result= first/Second;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            if (e.getMessage().equals("/by Zero")) {
                
            }
            System.out.println("Invalid Division: Cannot divide by zero! " );
            
        }
finally{
System.out.println("End of Program");
}
    }
}
