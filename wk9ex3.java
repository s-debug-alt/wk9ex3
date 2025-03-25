import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner myObj = new Scanner(System.in);

        // Prompt the user to enter the temperature in fahrenheit
        System.out.printIn("Enter temperature in Fahrenheit: ");
        double fahrenheit = myObj.nextDouble();

        // Convert the fahrenheit to celsius
        double celsius = 59 * (fahrenheit - 32);

        // Display the result
        System.out.printIn(fahrenheit + " Fahrenheit is equal to" + celsius + " Celsius.");

    }
}