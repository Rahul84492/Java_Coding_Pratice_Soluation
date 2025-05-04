import java.util.Scanner;

public class numberOfOccurrences {
    public static void main(String[] args) {
        System.out.println("welcome to print Occurences of the number:");
        Scanner input =  new Scanner (System.in);
        System.out.print("please Enter the number of elements: ");
        int size = input.nextInt();
        int [] values =new int[size];
        int i=0;
        while (i<size) {
            System.out.print("Enter the elements "+ (i+1)+": ");
            values[i]= input.nextInt();
            i++;
        }

        System.out.print("Enter the number to check occurrences: ");
        int num = input.nextInt();
        int occ=0;
        int j=0;
        while (j<values.length) {
            if (values[j]==num) {
                occ++;
            }
            j++;
        }
        System.out.println("Occurrences of " + num + " is: " + occ);

       
        }
    }
