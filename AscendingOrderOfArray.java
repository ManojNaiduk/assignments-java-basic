import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrderOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
