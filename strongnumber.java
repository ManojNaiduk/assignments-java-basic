import java.util.Scanner;

public class strongnumber {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
     
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }
        
        sc.close();
    }
}
