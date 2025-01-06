import java.util.Scanner;

public class SumLastThreeDigitsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int lastThreeDigits = Math.abs(number % 1000); 
        int sum = 0;
        int temp = lastThreeDigits;
        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10;      
        }
        if (isPalindrome(sum)) {
            System.out.println("The sum of the last three digits (" + lastThreeDigits + ") is " + sum + " and it is a palindrome.");
        } else {
            System.out.println("The sum of the last three digits (" + lastThreeDigits + ") is " + sum + " and it is not a palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(int num) {
        int reversed = 0, original = num;

        while (num > 0) {
            reversed = reversed * 10 + (num % 10); 
            num /= 10;
        }
        return original == reversed; 
    }
}
