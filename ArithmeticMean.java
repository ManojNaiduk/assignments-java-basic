import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num; 
        }

        double mean = sum / n;
        System.out.println("The arithmetic mean is: " + mean);

        scanner.close();
    }
}
