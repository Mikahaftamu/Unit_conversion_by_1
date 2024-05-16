package test;
import org.junit.*;

import static org.junit.Assert.*;

import main.LengthConverter;


public class LengthConverterTest {

    @Test
    public void testConvertFromMeters() {
        double lengthInMeters=10.0;

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


    public void testConvertFromKilo() {
        double lengthInKilo=10.0;

        double actual5 =LengthConverter.convertFromKilometer(lengthInKilo, "m");
        double expected5= 1000;
        assertEquals(expected5, actual5, 0.01);

        
        double actual1 =LengthConverter.convertFromKilometer(lengthInKilo, "cm");
        double expected1= 10.0;
        assertEquals(expected1, actual1, 0.01);

        double actual2 =LengthConverter.convertFromKilometer(lengthInKilo, "mm");
        double expected2= 1000000.0;
        assertEquals(expected2, actual2, 0.01);
}

}