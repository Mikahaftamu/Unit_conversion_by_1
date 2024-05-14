import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthConverterTest {
    
    public LengthConverterTest(){

    }
    
    @Test
    public void testConvertFromMeters() {
        double lengthInMeters = 10.0;

        Assertions.assertEquals(110.0, LengthConverter.convertFromMeters(lengthInMeters, "m"));
        Assertions.assertEquals(0.01, LengthConverter.convertFromMeters(lengthInMeters, "cm"));
        Assertions.assertEquals(10000.0, LengthConverter.convertFromMeters(lengthInMeters, "mm"));
        Assertions.assertEquals(0.00621371, LengthConverter.convertFromMeters(lengthInMeters, "mi"), 0.000001);
        Assertions.assertEquals(32.80839895, LengthConverter.convertFromMeters(lengthInMeters, "ft"), 0.000001);
        Assertions.assertEquals(393.7007874, LengthConverter.convertFromMeters(lengthInMeters, "in"), 0.000001);
        Assertions.assertEquals(10.93613298, LengthConverter.convertFromMeters(lengthInMeters, "yd"), 0.000001); 
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> LengthConverter.convertFromMeters(lengthInMeters, "invalid"));
    }

    @Test
    public void testConvertFromKilo() {
        double lengthkilo = 10.0;

        Assertions.assertEquals(110.0, LengthConverter.convertFromKilometer(lengthkilo, "m"));
        Assertions.assertEquals(0.01, LengthConverter.convertFromKilometer(lengthkilo, "cm"));
        Assertions.assertEquals(10000.0, LengthConverter.convertFromKilometer(lengthkilo, "mm"));
        Assertions.assertEquals(0.00621371, LengthConverter.convertFromKilometer(lengthkilo, "mi"), 0.000001);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> LengthConverter.convertFromMeters(lengthkilo, "invalid"));
    }

}
