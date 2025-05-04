import java.util.Scanner;

public class forEachOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to finding the Occurrences");
        int size = input.nextInt();
        int [] nums = new int[size];

        for(int i =0; i<size; i++){
            System.out.println("Please Enter the element "+ (i+1));
            nums[i]= input.nextInt();
            
        }
        System.out.print("Enter the element to find occurrences of: ");
        int element = input.nextInt();


        int occ = countOccurences(nums,element);
            System.out.println("ypur element was found: "+ occ + " times.");

    }
        public static int countOccurences(int[] nums, int element){
            int occ=0;
            for(int num : nums){
                if(num==element){
                    occ++;
                }
            }
            return occ;
        }
    }


