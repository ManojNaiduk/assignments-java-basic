import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the Fibonacci pattern: ");
        int rows = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Number Pattern:");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " "); 
                int next = a + b; 
                a = b; 
                b = next;
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
