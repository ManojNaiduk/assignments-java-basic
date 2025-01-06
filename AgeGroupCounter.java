import java.util.Scanner;

public class AgeGroupCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count50to60 = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Enter the age of person " + i + ": ");
            int age = scanner.nextInt();
            if (age >= 50 && age <= 60) {
                count50to60++;
            }
        }
        System.out.println("Number of people in the age group 50 to 60: " + count50to60);
        scanner.close();
    }
}
