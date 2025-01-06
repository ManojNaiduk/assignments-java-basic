import java.util.Scanner;
public class InterchangeFirstLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int result = interchangeFirstLast(number);
        System.out.println("After interchanging first and last digits: " + result);
    }
    public static int interchangeFirstLast(int num) {
        String numStr = Integer.toString(num);
        if(numStr.length() == 1) return Integer.parseInt(numStr);
        char firstDigit = numStr.charAt(0);
        char lastDigit = numStr.charAt(numStr.length() - 1);
        String newNumStr = lastDigit + numStr.substring(1, numStr.length() - 1) + firstDigit;
        int result = Integer.parseInt(newNumStr);
        return result;
    }
}