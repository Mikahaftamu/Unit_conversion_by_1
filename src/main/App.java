package main;

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
            System.out.println("4. Time Conversion");
            System.out.println("5. Volume Conversion");
            System.out.println("6. Exit");
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
                    // Call function for temperature conversion
                    timeConversion();
                    break;
                case 5:
                    // Call function for temperature conversion
                    volumeConversion();
                    break;
                case 6:
                    System.out.println("Exiting Unit Converter...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }

    public static void lengthConversion() {
        // Implement length conversion logic here
        System.out.println("Length Conversion Functionality");
    }

    public static void weightConversion() {
        // Implement weight conversion logic here
        System.out.println("Weight Conversion Functionality");
    }

    // this is volume
    public static void volumeConversion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion option:");
        System.out.println("_______________________________");
        System.out.println("1. Litre to Milliliter");
        System.out.println("2. Milliliter to Litre");
        System.out.println("3. Litre to Cubic Meter");
        System.out.println("4. Cubic Meter to Litre");
        System.out.println("5. Litre to Cubic Centimeter");
        System.out.println("6. Cubic Centimeter to Litre");
        System.out.println("7. Milliliter to Cubic Centimeter");
        System.out.println("8. Cubic Centimeter to Milliliter");
        System.out.println("9. Cubic Centimeter to Cubic Meter");
        System.out.println("10. Cubic Meter to Cubic Centimeter");
        System.out.println("11. Cubic Meter to Milliliter");
        System.out.println("12. Milliliter to Cubic Meter");
        System.out.println("13. Back to Main Menu");

        int option = scanner.nextInt();
        double value;

        switch (option) {
            case 1:
                System.out.print("Enter value in litres: ");
                value = scanner.nextDouble();
                double milliliter = VolumeConverter.litreToMilliliter(value);
                System.out.println(value + " litres = " + milliliter + " milliliters");
                break;
            case 2:
                System.out.print("Enter value in milliliters: ");
                value = scanner.nextDouble();
                double litre = VolumeConverter.milliliterToLitre(value);
                System.out.println(value + " milliliters = " + litre + " litres");
                break;
            case 3:
                System.out.print("Enter value in litres: ");
                value = scanner.nextDouble();
                double cubicMeter = VolumeConverter.litreToCubicMeter(value);
                System.out.println(value + " litres = " + cubicMeter + " cubic meters");
                break;
            case 4:
                System.out.print("Enter value in cubic meters: ");
                value = scanner.nextDouble();
                double convertedLitre2 = VolumeConverter.cubicMeterToLitre(value);
                System.out.println(value + " cubic meters = " + convertedLitre2 + " litres");
                break;
            case 5:
                System.out.print("Enter value in litres: ");
                value = scanner.nextDouble();
                double cubicCentimeter = VolumeConverter.litreToCubicCentimeter(value);
                System.out.println(value + " litres = " + cubicCentimeter + " cubic centimeters");
                break;
            case 6:
                System.out.print("Enter value in cubic centimeters: ");
                value = scanner.nextDouble();
                double convertedLitre3 = VolumeConverter.cubicCentimeterToLitre(value);
                System.out.println(value + " cubic centimeters = " + convertedLitre3 + " litres");
                break;
            case 7:
                System.out.print("Enter value in milliliters: ");
                value = scanner.nextDouble();
                double cubicCentimeter2 = VolumeConverter.milliliterToCubicCentimeter(value);
                System.out.println(value + " milliliters = " + cubicCentimeter2 + " cubic centimeters");
                break;
            case 8:
                System.out.print("Enter value in cubic centimeters: ");
                value = scanner.nextDouble();
                double convertedMilliliter = VolumeConverter.cubicCentimeterToMilliliter(value);
                System.out.println(value + " cubic centimeters = " + convertedMilliliter + " milliliters");
                break;
            case 9:
                System.out.print("Enter value in cubic centimeters: ");
                value = scanner.nextDouble();
                double cubicMeter2 = VolumeConverter.cubicCentimeterToCubicMeter(value);
                System.out.println(value + " cubic centimeters = " + cubicMeter2 + " cubic meters");
                break;
            case 10:
                System.out.print("Enter value in cubic meters: ");
                value = scanner.nextDouble();
                double cubicCentimeter3 = VolumeConverter.cubicMeterToCubicCentimeter(value);
                System.out.println(value + " cubic meters = " + cubicCentimeter3 + " cubic centimeters");
                break;
            case 11:
                System.out.print("Enter value in cubic meters: ");
                value = scanner.nextDouble();
                double milliliter2 = VolumeConverter.cubicMeter_To_Milliliter(value);
                System.out.println(value + " cubic meters = " + milliliter2 + " milliliters");
                break;
            case 12:
                System.out.print("Enter value in milliliters: ");
                value = scanner.nextDouble();
                double cubicMeter3 = VolumeConverter.milliliter_To_CubicMeter(value);
                System.out.println(value + " milliliters = " + cubicMeter3 + " cubicmeters");
                break;
            case 13:
                System.out.println("Returning to Main Menu...");
                break;
            default:
                System.out.println("Invalid option");
        }

        // scanner.close();
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
    }

    public static void timeConversion() {
        Scanner scanner = new Scanner(System.in);
        int tempChoice;

        System.out.println("\nTime Conversion Submenu");
        System.out.println("------------------------------");
        System.out.println("1. Hours (H) to Minutes (M)");
        System.out.println("2. Hours (H) to Seconds (S)");
        System.out.println("3. Seconds (S) to Minutes (M)");
        System.out.println("4. Seconds (S) to Hours (H)");
        System.out.println("5. Minutes (M) to Seconds (S)");
        System.out.println("6. Minutes (M) to Hours (H)");
        System.out.println("7. Back to Main Menu");
        System.out.print("Enter your choice: ");

        tempChoice = scanner.nextInt();

        switch (tempChoice) {
            case 1:
                System.out.print("Enter time in Hours: ");
                int time = scanner.nextInt();

                // double fahrenheit = TimeConversion.celsiusToFahrenheit(celsius);
                // System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + "
                // degrees Fahrenheit.");
                break;
            case 2:
                // Get temperature in Fahrenheit
                System.out.print("Enter time in Hours: ");
                // fahrenheit = scanner.nextDouble();

                // // Call method from TemperatureConverter class
                // celsius = TempConversion.fahrenheitToCelsius(fahrenheit);
                // System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius
                // + " degrees Celsius.");
                break;
            case 3:
                // Celsius to Kelvin
                System.out.print("Enter time in Seconds: ");
                time = scanner.nextInt();
                double minutes = TimeConversion.convertSecondsToMinutes(time);
                System.out.println(time + " seconds is equal to " + minutes + " minutes.");
                break;
            case 4:
                // Kelvin to Celsius
                System.out.print("Enter time in Seconds: ");
                time = scanner.nextInt();
                minutes = TimeConversion.convertSecondsToHours(time);
                System.out.println(time + " seconds is equal to " + minutes + " hours.");
                break;
            case 5:
                // Fahrenheit to Kelvin
                System.out.print("Enter time in Minutes: ");
                time = scanner.nextInt();
                minutes = TimeConversion.convertMinutesToSeconds(time);
                System.out.println(time + " minutes is equal to " + minutes + " seconds.");
                break;
            case 6:
                // Kelvin to Fahrenheit
                System.out.print("Enter time in Minutes: ");
                time = scanner.nextInt();
                minutes = TimeConversion.convertMinutesToHours(time);
                System.out.println(time + " minutes is equal to " + minutes + " hours.");
                break;
            case 7:
                System.out.println("Returning to Main Menu...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

//
//