import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hex = Integer.toHexString(decimal).toUpperCase(); 
        System.out.println("Decimal " + decimal + " to Hexadecimal: " + hex);
        System.out.print("Enter a hexadecimal number: ");
        String hexInput = scanner.next();
        int decimalFromHex = Integer.parseInt(hexInput, 16); 
        String octal = Integer.toOctalString(decimalFromHex); 
        System.out.println("Hexadecimal " + hexInput + " to Octal: " + octal);
        System.out.print("Enter an octal number: ");
        String octalInput = scanner.next();
        int decimalFromOctal = Integer.parseInt(octalInput, 8); 
        String binary = Integer.toBinaryString(decimalFromOctal); 
        System.out.println("Octal " + octalInput + " to Binary: " + binary);

        scanner.close();
    }
}
