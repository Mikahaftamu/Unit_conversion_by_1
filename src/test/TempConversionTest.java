package test;
import org.junit.*;

import main.TempConversion;

import static org.junit.Assert.*;

public class TempConversionTest {

    @Test
    public void testCelsiusToFahrenheit() {
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;
        double actualFahrenheit = TempConversion.celsiusToFahrenheit(celsius);
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.01); // Allow for rounding errors
    }

    @Test
    public void testFahrenheitToCelsius() {
        double fahrenheit = 100.0;
        double expectedCelsius = 37.78; // Conversion may have slight rounding errors
        double actualCelsius = TempConversion.fahrenheitToCelsius(fahrenheit);
        assertEquals(expectedCelsius, actualCelsius, 0.01); // Allow for rounding errors
    }

    @Test
    public void testCelsiusToKelvin() {
        double celsius = 100.0;
        double expectedKelvin = 373.15;
        double actualKelvin = TempConversion.celsiusToKelvin(celsius);
        assertEquals(expectedKelvin, actualKelvin, 0.01); // Allow for rounding errors
    }

    @Test
    public void testKelvinToCelsius() {
        double kelvin = 273.15;
        double expectedCelsius = 0.0;
        double actualCelsius = TempConversion.kelvinToCelsius(kelvin);
        assertEquals(expectedCelsius, actualCelsius, 0.01); // Allow for rounding errors
    }

    @Test
    public void testFahrenheitToKelvin() {
        double fahrenheit = 212.0;
        double expectedKelvin = 373.15;
        double actualKelvin = TempConversion.fahrenheitToKelvin(fahrenheit);
        assertEquals(expectedKelvin, actualKelvin, 0.01); // Allow for rounding errors
    }

    @Test
    public void testKelvinToFahrenheit() {
        double kelvin = 100.0;
        double expectedFahrenheit = -279.67; // Conversion may have slight rounding errors
        double actualFahrenheit = TempConversion.kelvinToFahrenheit(kelvin);
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.01); // Allow for rounding errors
    }
}
