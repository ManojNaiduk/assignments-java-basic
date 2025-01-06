import java.util.Scanner;

public class lastthreedivisibilityby3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int lastThreeDigits = (int) Math.abs(number % 1000); // Ensure it's positive

        if (lastThreeDigits % 3 == 0) {
            System.out.println("The last three digits (" + lastThreeDigits + ") are divisible by 3.");
        } else {
            System.out.println("The last three digits (" + lastThreeDigits + ") are not divisible by 3.");
        }

        scanner.close();
    }
}
