import java.util.Scanner;

public class ageGroups {
    public static void main(String[] args) {
        System.out.println("welcome to print Age Group ");
        Scanner  input = new Scanner( System.in);
        System.out.println(" Please Enter your Age: ");
        int Age = input.nextInt();
        if ( Age < 13) {
            System.out.println("You are Child Categorized: "+ Age);
        }
        else if (Age < 20){
            System.out.println("You Are is teen Categorized: " + Age);
        }
        else if (Age <= 60){
            System.out.println("You are Adult Categorized: "+ Age);
        }
        else{
            System.out.println("You are is Senior Citizen Categorized :"+ Age );
        }
    }
}
