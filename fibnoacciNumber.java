import java.util.Scanner;

public class fibnoacciNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to print the Fibonaccin Series");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter number:");
        int num= input.nextInt();
        if (num<0) {
         System.out.println("Please Enter the Postive Number ");
         return;
            
        }
        if (num==1) {
            System.out.println("1 ");
        }
        int i=0;
        int j=1;
        int k = 0;
        System.out.println(i + " " + j);
        while (i+j<=num) {
            k= i+j;
           
            System.out.print(" "+k);
            i=j;
            j=k;
        }
        System.out.println(" ");
       
    }
}
