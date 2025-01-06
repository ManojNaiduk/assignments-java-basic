import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        countDuplicates(arr);
        scanner.close();
    }

    public static void countDuplicates(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        boolean hasDuplicates = false;
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                hasDuplicates = true;
                System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
