import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking the element to delete
        System.out.print("Enter the element to delete: ");
        int deleteElement = sc.nextInt();

        // Finding and deleting the element
        int[] newArr = new int[n - 1];  // New array with one less size
        int j = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == deleteElement && !found) {
                found = true;  // Mark that the element is found
                continue;  // Skip copying this element
            }
            if (j < newArr.length) {
                newArr[j++] = arr[i];
            }
        }

        if (found) {
            // Displaying the updated array
            System.out.print("Updated array: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Element not found in the array!");
        }

        sc.close();
    }
}
