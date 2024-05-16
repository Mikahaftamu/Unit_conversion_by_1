package test;
import org.junit.*;

import static org.junit.Assert.*;

import main.LengthConverter;


public class LengthConverterTest {

    @Test
    public void testConvertFromMeters() {
        double lengthInMeters=10.00;

        double actual5 =LengthConverter.convertFromMeters(lengthInMeters, "km");
        double expected5= 0.01;
        assertEquals(expected5, actual5, 0.01);

        
        double actual1 =LengthConverter.convertFromMeters(lengthInMeters, "cm");
        double expected1= 1000.0;
        assertEquals(expected1, actual1, 0.01);

        double actual2 =LengthConverter.convertFromMeters(lengthInMeters, "mm");
        double expected2= 10000.0;
        assertEquals(expected2, actual2, 0.01);

    
    }

    @Test
    public void testConvertFromKilo() {
        double lengthkilo = 10.0;

        double actual5 =LengthConverter.convertFromKilometer(lengthkilo, "m");
        double expected5= 0.01;
        assertEquals(expected5, actual5, 0.01);

        
        double actual1 =LengthConverter.convertFromKilometer(lengthkilo, "cm");
        double expected1= 1000.0;
        assertEquals(expected1, actual1, 0.01);

        double actual2 =LengthConverter.convertFromKilometer(lengthkilo, "mm");
        double expected2= 10000.0;
        assertEquals(expected2, actual2, 0.01);

    }
}