import java.util.Scanner;

public class NFibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series up to " + n + ":");
        printFibonacciSeries(n);
        scanner.close();
    }
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print(first);
        while (second <= n) {
            System.out.print(", " + second);
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
