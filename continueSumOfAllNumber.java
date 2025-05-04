import java.util.Scanner;

public class continueSumOfAllNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of positive Number  ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the You Want to Sum: ");
        int num = input.nextInt();
        int sum=0;
        for(int i=0; i<=num; i++){
            sum=sum+i;
            if (num<0) {
                continue;
            }
            
            
        }
        System.out.println(sum);
    }
}
