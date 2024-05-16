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
    @Test
    public void testConvertFromcm() {
        double lengthincm = 1000.0;


        double actual5 =LengthConverter.convertFromcentimeter(lengthincm, "m");
        double expected5= 10.0;
        assertEquals(expected5, actual5, 0.01);

        
        double actual1 =LengthConverter.convertFromcentimeter(lengthincm, "km");
        double expected1= 1.0;
        assertEquals(expected1, actual1, 0.01);

        double actual2 =LengthConverter.convertFromcentimeter(lengthincm, "mm");
        double expected2= 100000.0;
        assertEquals(expected2, actual2, 0.01);
    }

    @Test
    public void testConvertFrommm() {
        double lengthinmm = 10000.0;

        double actual5 =LengthConverter.convertFrommilimeter(lengthinmm, "m");
        double expected5= 10.0;
        assertEquals(expected5, actual5, 0.01);

        
        double actual1 =LengthConverter.convertFrommilimeter(lengthinmm, "kilo");
        double expected1= 1.0;
        assertEquals(expected1, actual1, 0.01);

        double actual2 =LengthConverter.convertFrommilimeter(lengthinmm, "cm");
        double expected2= 1000.0;
        assertEquals(expected2, actual2, 0.01);
    }
}