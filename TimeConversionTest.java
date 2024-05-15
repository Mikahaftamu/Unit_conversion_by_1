import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConversionTest {

    @Test
    public void testConvertSecondsToMinutes() {
        assertEquals(61, TimeConversion.convertSecondsToMinutes(3661));
        assertEquals(0, TimeConversion.convertSecondsToMinutes(0));
        assertEquals(1, TimeConversion.convertSecondsToMinutes(60));
        assertEquals(60, TimeConversion.convertSecondsToMinutes(3600));
    }

  

}