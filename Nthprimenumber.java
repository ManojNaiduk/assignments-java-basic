import java.util.Scanner;

public class Nthprimenumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int nthPrimeNumber = nthPrime(n);
        System.out.println("The " + n + "th prime number is: " + nthPrimeNumber);

        sc.close();
    }
}
