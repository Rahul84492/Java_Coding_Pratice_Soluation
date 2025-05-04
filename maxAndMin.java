import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        System.out.println("Welcome to find the Max And Min elements in the Array: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the elements of number: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i =0;
        while (i<size) {
            System.out.println("Enter the number of elements " + (i+1)+ ": ");
             num[i]=input.nextInt();
             i++;
            
        }
        int j=1;
        int max=0;
        while (j<num.length) {
            if (max <num[j]) {
                max=num[j];
            }
            j++;
        }
        System.out.print("max  value:" + max);

        int k =1;
        int Min=0;
        while (k<num.length) {
            if (Min > num[k]) {
                Min=num[k];
            }
            k++;
        }
        System.out.println("min Elements: "+ Min);

        

    }
}
