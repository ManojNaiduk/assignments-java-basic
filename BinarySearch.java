import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " sorted elements:");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = s.nextInt();
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; 
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return -1;
    }
}