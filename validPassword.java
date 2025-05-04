import java.util.Scanner;;
public class validPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password checker ");
        String password;
        do{
            System.out.println("Enter your password: ");
            password = input.next();

        }while(!isValidPassword(password));
        System.out.println("Thanks for entering the valid password");
    }


    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
