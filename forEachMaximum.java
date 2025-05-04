import java.util.Scanner;

public class forEachMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to Print the Maximum Number in the Array");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter the Value: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            System.out.print("Please enter " + (i+1) + " values:");
             arr[i]= input.nextInt();
             
        }
        int max=arr[0];
        for(int num :arr){
          if (num>max) {
            max=num;
          }
          
        }
        System.out.println("Max Element is: "+ max);
        
    }
}
