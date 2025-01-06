import java.util.Scanner;

public class ReverseNumberAndLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;  
        int reversedNum = 0;    
        int length = 0;         

        while (num != 0) {
            int digit = num % 10;      
            reversedNum = reversedNum * 10 + digit; 
            num = num / 10;            
            length++;                  
        }
        System.out.println("Reversed Number: " + reversedNum);
        System.out.println("Length of the Number: " + length);

        scanner.close();
    }
}
