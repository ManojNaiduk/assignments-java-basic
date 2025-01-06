import java.util.Scanner;

public class primenumbersbelowN {

   
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        
        System.out.println("Prime numbers below " + N + ":");

        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
