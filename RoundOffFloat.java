import java.util.Scanner;

public class RoundOffFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float value = scanner.nextFloat();

        int roundedInt = Math.round(value);

        System.out.print("Enter the number of decimal places to round off to: ");
        int decimalPlaces = scanner.nextInt();

        double roundedToDecimals = roundToDecimalPlaces(value, decimalPlaces);

        System.out.println("Rounded to the nearest integer: " + roundedInt);
        System.out.println("Rounded to " + decimalPlaces + " decimal place(s): " + roundedToDecimals);

        scanner.close();
    }

    public static double roundToDecimalPlaces(float value, int decimalPlaces) {
        double scale = Math.pow(10, decimalPlaces);
        return Math.round(value * scale) / scale;
    }
}
