import java.util.Scanner;

 class recursionPalindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = input.nextLine();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        input.close();
    }

    public static boolean isPalindrome(String str, int start, int end) {
        
        if (start >= end) {
            return true;
        }
        
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        return isPalindrome(str, start + 1, end - 1);
    }
}
