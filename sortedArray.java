import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        System.out.println("welcome to Sort the Arryas: ");
        Scanner input = new Scanner(System.in);
        System.out.println("PLease Enter the Elements: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i   = 0;
        while (i<size) {
            System.out.println("Please Enter the number: " + (i+1)+": ");
            num[i]= input.nextInt();
        }
    }
}
