import java.util.Scanner;

public class SwapLastTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println("The number must have at least two digits.");
        } else {
            int lastTwoDigits = number % 100;  
            int lastDigit = lastTwoDigits % 10; 
            int secondLastDigit = lastTwoDigits / 10;
            int remainingNumber = number / 100;
            int swappedNumber = remainingNumber * 100 + lastDigit * 10 + secondLastDigit;
            System.out.println("Number after swapping last two digits: " + swappedNumber);
        }
        scanner.close();
    }
}
