import java.util.Scanner;

public class sumAverageArray {
    public static void main(String[] args) {
        System.out.println("Welcome to print the sum And Average of An Array");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number of elements: ");
        int size = input.nextInt();
        int [] Values = new int[size];
        int i=0;
        
        while (i<size) {
            System.out.println("please Enter Element no: "+ (i+1)+ ": ");
            Values[i]= input.nextInt();
            
            i++;
            
            
        }
       int k= 0;
       int sum=0;
       while (k<Values.length) {
        sum= sum+Values[k];
        
        k++;
       
       }
       
       float avg =(float) sum/Values.length;
       System.out.println("Total Sum: " + sum);
        System.out.println("Total avg: "+avg);
    }
}
