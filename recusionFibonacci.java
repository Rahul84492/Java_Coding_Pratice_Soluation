import java.util.Scanner;

public class recusionFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to printing the Fibnacci Series ");
        System.out.println("Enter the number of elements to be printed: ");
        int countOccurences = input.nextInt();
        for (int i =1; i<=countOccurences; i++){
            System.out.println(Fibnacci(i)+ " ");
        }
    }
    public static int Fibnacci(int postion ){
       
        if (postion==1) {
            return 0;
        }
        if (postion==2) {
            return 1;
            
        }
        return Fibnacci(postion -1) + Fibnacci(postion-2);
    }
}
