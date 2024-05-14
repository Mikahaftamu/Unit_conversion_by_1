import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nUnit Converter Menu");
            System.out.println("--------------------");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("3. Temperature Conversion");
            // Add more options for other conversions
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Call function for length conversion
                    lengthConversion();
                    break;
                case 2:
                    // Call function for weight conversion
                    weightConversion();
                    break;
                case 3:
                    // Call function for temperature conversion
                    temperatureConversion();
                    break;
                case 4:
                    System.out.println("Exiting Unit Converter...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void lengthConversion() {
        // Implement length conversion logic here
        System.out.println("Length Conversion Functionality");
    }

    public static void weightConversion() {
        // Implement weight conversion logic here
        System.out.println("Weight Conversion Functionality");
    }

    public static void temperatureConversion() {
        Scanner scanner = new Scanner(System.in);
        int tempChoice;

        System.out.println("\nTemperature Conversion Submenu");
        System.out.println("------------------------------");
        System.out.println("1. Celsius (C) to Fahrenheit (F)");
        System.out.println("2. Fahrenheit (F) to Celsius (C)");
        System.out.println("3. Celsius (C) to Kelvin (K)");
        System.out.println("4. Kelvin (K) to Celsius (C)");
        System.out.println("5. Fahrenheit (F) to Kelvin (K)");
        System.out.println("6. Kelvin (K) to Fahrenheit (F)");
        System.out.println("7. Back to Main Menu");
        System.out.print("Enter your choice: ");

        tempChoice = scanner.nextInt();

        switch (tempChoice) {
            case 1:
                // Get temperature in Celsius
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();

                // Call method from TemperatureConverter class
                double fahrenheit = TempConversion.celsiusToFahrenheit(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 2:
                // Get temperature in Fahrenheit
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();

                // Call method from TemperatureConverter class
                celsius = TempConversion.fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
                break;
            case 3:
                // Celsius to Kelvin
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                double kelvin = TempConversion.celsiusToKelvin(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + kelvin + " degrees Kelvin.");
                break;
            case 4:
                // Kelvin to Celsius
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = scanner.nextDouble();
                celsius = TempConversion.kelvinToCelsius(kelvin);
                System.out.println(kelvin + " degrees Kelvin is equal to " + celsius + " degrees Celsius.");
                break;
            case 5:
                // Fahrenheit to Kelvin
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                kelvin = TempConversion.fahrenheitToKelvin(fahrenheit);
                System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + kelvin + " degrees Kelvin.");
                break;
            case 6:
                // Kelvin to Fahrenheit
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = scanner.nextDouble();
                fahrenheit = TempConversion.kelvinToFahrenheit(kelvin);
                System.out.println(kelvin + " degrees Kelvin is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 7:
                System.out.println("Returning to Main Menu...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }
}
