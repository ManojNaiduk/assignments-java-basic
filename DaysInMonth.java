import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        int daysInMonth = getDaysInMonth(year, month);
        if (daysInMonth == -1) {
            System.out.println("Invalid month entered. Please enter a month between 1 and 12.");
        } else {
            System.out.println("Number of days in month " + month + " of year " + year + " is: " + daysInMonth);
        }
        scanner.close();
    }
    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            return -1; 
        }
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29; 
            }
        }

        return daysInMonths[month - 1];
    }
}
