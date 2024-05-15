import org.junit.Assert;
import org.junit.Test;
    public class WeightConverterTest {

        @Test
        public void testKilogramToGram() {
            double result = WeightConverter.kilogramToGram(2.5);
            Assert.assertEquals(2500, result, 0.0001);
        }
    
        @Test
        public void testGramToKilogram() {
            double result = WeightConverter.gramToKilogram(5000);
            Assert.assertEquals(5, result, 0.0001);
        }
        @Test
    public void testMilligramToGram() {
        double result = WeightConverter.milligramToGram(7500);
        Assert.assertEquals(7.5, result, 0.0001);
    }

    @Test
    public void testGramToMilligram() {
        double result = WeightConverter.gramToMilligram(3.5);
        Assert.assertEquals(3500, result, 0.0001);
    }
    
}
