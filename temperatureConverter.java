import java.util.Scanner;
class temperatureConverter {
    public static void main(String[] args) {

        // Temperature Conversion Program usinf if else statement
        /* 
        double celsius, fahrenheit;
        int choice;
        Scanner s = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        System.out.print("Choose an option: ");
        choice = s.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            celsius = s.nextDouble();
            fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);

        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            fahrenheit = s.nextDouble();
            celsius = (fahrenheit - 32) * 5/9;
            System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }



        s.close();
        */


        // Temperature Conversion Program using ternary operator
        double temp, newtemp;
        String unit;
        Scanner s = new Scanner(System.in);
        System.out.println("Temperature Conversion Program using Ternary Operator");
        System.out.println(("ENTER TEMPERATURE: "));
        temp = s.nextDouble();

        System.out.println("ENTER UNIT (C for Celsius, F for Fahrenheit): ");
        unit = s.next().toUpperCase(); // Convert to uppercase for consistency
        newtemp = (unit.equals("C")) ? (temp * 9/5) + 32 : (temp - 32) * 5/9;

        System.out.printf("Converted Temperature: %.1f %s", newtemp, unit);

        s.close();
    }
    
}
