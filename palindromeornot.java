import java.util.Scanner;

public class palindromeornot{

    public static boolean isPalindromeNumber(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static boolean isPalindromeString(String str) {
        
        str = str.toLowerCase().replaceAll("\\s", "");

     
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter '1' to check a number or '2' to check a string: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            if (isPalindromeNumber(num)) {
                System.out.println(num + " is a Palindrome Number.");
            } else {
                System.out.println(num + " is not a Palindrome Number.");
            }
        } else if (choice == 2) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            if (isPalindromeString(str)) {
                System.out.println("\"" + str + "\" is a Palindrome String.");
            } else {
                System.out.println("\"" + str + "\" is not a Palindrome String.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
