import java.util.Scanner;

public class SumEvenProductOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int sumEven = 0; 
        int productOdd = 1; 
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sumEven += num; 
            } else {
                productOdd *= num; 
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Product of odd numbers: " + productOdd);
        scanner.close();
    }
}
