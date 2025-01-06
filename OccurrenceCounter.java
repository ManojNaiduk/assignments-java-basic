import java.util.Scanner;

public class OccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to count its occurrence: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " occurs " + count + " times in the array.");
        scanner.close();
    }
}
