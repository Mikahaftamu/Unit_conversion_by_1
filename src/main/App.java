package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nUnit Converter Menu");
            System.out.println("--------------------");
            System.out.println("1. Time Conversion");
            System.out.println("2. Volume Conversion");
            System.out.println("3. Temperature Conversion");
            System.out.println("4. Weight Conversion");
            System.out.println("5. Length Conversion");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    timeConversion();
                    break;
                case 2:
                    volumeConversion();
                    break;
                case 3:
                    temperatureConversion();
                    break;
                case 4:
                    weightConversion();
                    break;
                case 5:
                    lengthConversion();
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
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Select conversion option:");
            System.out.println("_______________________________");
            System.out.println("1. Convert from meters");
            System.out.println("2. Convert from kilometers");
            System.out.println("3. Convert from centimeters");
            System.out.println("4. Convert from millimeters");
            System.out.println("5. Back to Main Menu");
            System.out.println("___________________________________");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            double value;
            String unit;
            if (option == 5) {
                System.out.println("Returning to the main menu...");
                break;
            }
            switch (option) {
                case 1:
                    System.out.print("Enter value in meters: ");
                    value = scanner.nextDouble();
                    System.out.print("Enter target unit (km, cm, mm): ");
                    unit = scanner.next();
                    double convertedValue1 = LengthConverter.convertFromMeters(value, unit);
                    System.out.println(value + " meters = " + convertedValue1 + " " + unit);
                    break;
                case 2:
                    System.out.print("Enter value in kilometers: ");
                    value = scanner.nextDouble();
                    System.out.print("Enter target unit (m, cm, mm): ");
                    unit = scanner.next();
                    double convertedValue2 = LengthConverter.convertFromKilometer(value, unit);
                    System.out.println(value + " kilometers = " + convertedValue2 + " " + unit);
                    break;
                case 3:
                    System.out.print("Enter value in centimeters: ");
                    value = scanner.nextDouble();
                    System.out.print("Enter target unit (m, mm, km): ");
                    unit = scanner.next();
                    double convertedValue3 = LengthConverter.convertFromcentimeter(value, unit);
                    System.out.println(value + " centimeters = " + convertedValue3 + " " + unit);
                    break;
                case 4:
                    System.out.print("Enter value in millimeters: ");
                    value = scanner.nextDouble();
                    System.out.print("Enter target unit (m, cm, km): ");
                    unit = scanner.next();
                    double convertedValue4 = LengthConverter.convertFrommilimeter(value, unit);
                    System.out.println(value + " millimeters = " + convertedValue4 + " " + unit);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        // scanner.close();
    }

    public static void weightConversion() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Select conversion option:");
            System.out.println("_______________________________");
            System.out.println("1. Kilogram to Gram");
            System.out.println("2. Gram to Kilogram");
            System.out.println("3. Milligram to Gram");
            System.out.println("4. Gram to Milligram");
            System.out.println("5. Milligram to Kilogram");
            System.out.println("6. Kilogram to Milligram");
            System.out.println("7. Pound to Kilogram");
            System.out.println("8. Kilogram to Pound");
            System.out.println("9. Pound to Gram");
            System.out.println("10. Gram to Pound");
            System.out.println("11. Pound to Milligram");
            System.out.println("12. Milligram to Pound");
            System.out.println("13. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            double value;
            if (option == 13) {
                System.out.println("Returning to the main menu...");
                break;
            }
            switch (option) {
                case 1:
                    System.out.print("Enter value in kilograms: ");
                    value = scanner.nextDouble();
                    double gram = WeightConverter.kilogramToGram(value);
                    System.out.println(value + " kilograms = " + gram + " grams");
                    break;
                case 2:
                    System.out.print("Enter value in grams: ");
                    value = scanner.nextDouble();
                    double kilogram = WeightConverter.gramToKilogram(value);
                    System.out.println(value + " grams = " + kilogram + " kilograms");
                    break;
                case 3:
                    System.out.print("Enter value in milligrams: ");
                    value = scanner.nextDouble();
                    double gram2 = WeightConverter.milligramToGram(value);
                    System.out.println(value + " milligrams = " + gram2 + " grams");
                    break;
                case 4:
                    System.out.print("Enter value in grams: ");
                    value = scanner.nextDouble();
                    double milligram = WeightConverter.gramToMilligram(value);
                    System.out.println(value + " grams = " + milligram + " milligrams");
                    break;
                case 5:
                    System.out.print("Enter value in milligrams: ");
                    value = scanner.nextDouble();
                    double kilogram2 = WeightConverter.milligramToKilogram(value);
                    System.out.println(value + " milligrams = " + kilogram2 + " kilograms");
                    break;
                case 6:
                    System.out.print("Enter value in kilograms: ");
                    value = scanner.nextDouble();
                    double milligram2 = WeightConverter.kilogramToMilligram(value);
                    System.out.println(value + " kilograms = " + milligram2 + " milligrams");
                    break;
                case 7:
                    System.out.print("Enter value in pounds: ");
                    value = scanner.nextDouble();
                    double kilogram3 = WeightConverter.poundToKilogram(value);
                    System.out.println(value + " pounds = " + kilogram3 + " kilograms");
                    break;
                case 8:
                    System.out.print("Enter value in kilograms: ");
                    value = scanner.nextDouble();
                    double pound = WeightConverter.kilogramToPound(value);
                    System.out.println(value + " kilograms = " + pound + " pounds");
                    break;
                case 9:
                    System.out.print("Enter value in pounds: ");
                    value = scanner.nextDouble();
                    double gram3 = WeightConverter.poundToGram(value);
                    System.out.println(value + " pounds = " + gram3 + " grams");
                    break;
                case 10:
                    System.out.print("Enter value in grams: ");
                    value = scanner.nextDouble();
                    double pound2 = WeightConverter.gramToPound(value);
                    System.out.println(value + " grams = " + pound2 + " pounds");
                    break;
                case 11:
                    System.out.print("Enter value in pounds: ");
                    value = scanner.nextDouble();
                    double milligram3 = WeightConverter.poundToMilligram(value);
                    System.out.println(value + " pounds = " + milligram3 + " milligrams");
                    break;
                case 12:
                    System.out.print("Enter value in milligrams: ");
                    value = scanner.nextDouble();
                    double pound3 = WeightConverter.milligramToPound(value);
                    System.out.println(value + " milligrams = " + pound3 + " pounds");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        // scanner.close();
    }

    public static void volumeConversion() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
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
            System.out.print("Enter your correct choice: ");

            int option = scanner.nextInt();
            double value;
            if (option == 13) {
                System.out.println("returning to main menu....");
                break;
            }
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
                    System.out.println("Invalid option:");
                    break;

            }
        }
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
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();

                double fahrenheit = TempConversion.celsiusToFahrenheit(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();

                celsius = TempConversion.fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                double kelvin = TempConversion.celsiusToKelvin(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + kelvin + " degrees Kelvin.");
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = scanner.nextDouble();
                celsius = TempConversion.kelvinToCelsius(kelvin);
                System.out.println(kelvin + " degrees Kelvin is equal to " + celsius + " degrees Celsius.");
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                kelvin = TempConversion.fahrenheitToKelvin(fahrenheit);
                System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + kelvin + " degrees Kelvin.");
                break;
            case 6:
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

                double mins = TimeConversion.convertHoursToMinutes(time);
                System.out.println(time + " hours is equal to " + mins + " minutes.");
                break;
            case 2:
                System.out.print("Enter time in Hours: ");
                time = scanner.nextInt();

                mins = TimeConversion.convertHoursToSeconds(time);
                System.out.println(time + " hours is equal to " + mins + " seconds.");
                break;
            case 3:
                System.out.print("Enter time in Seconds: ");
                time = scanner.nextInt();
                double minutes = TimeConversion.convertSecondsToMinutes(time);
                System.out.println(time + " seconds is equal to " + minutes + " minutes.");
                break;
            case 4:
                System.out.print("Enter time in Seconds: ");
                time = scanner.nextInt();
                minutes = TimeConversion.convertSecondsToHours(time);
                System.out.println(time + " seconds is equal to " + minutes + " hours.");
                break;
            case 5:
                System.out.print("Enter time in Minutes: ");
                time = scanner.nextInt();
                minutes = TimeConversion.convertMinutesToSeconds(time);
                System.out.println(time + " minutes is equal to " + minutes + " seconds.");
                break;
            case 6:
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
