import java.util.Scanner;

public class SumToSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = number;
        while (result >= 10) {
            result = sumOfDigits(result);
        }

        System.out.println("The single-digit sum is: " + result);

        scanner.close();
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;     
        }
        return sum;
    }
}
