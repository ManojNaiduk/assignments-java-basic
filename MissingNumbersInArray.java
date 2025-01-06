import java.util.*;

public class MissingNumbersInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (in any order, without duplicates):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findMissingNumbers(arr, n);
        scanner.close();
    }

    public static void findMissingNumbers(int[] arr, int n) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            numberSet.add(i);
        }
        for (int num : arr) {
            numberSet.remove(num);
        }
        if (numberSet.isEmpty()) {
            System.out.println("No missing numbers.");
        } else {
            System.out.print("Missing numbers: ");
            for (int missingNumber : numberSet) {
                System.out.print(missingNumber + " ");
            }
            System.out.println();
        }
    }
}
