package test;
import org.junit.*;

public class weightConverterTest {
    
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
    @Test
    public void testMilligramToKilogram() {
        double result = WeightConverter.milligramToKilogram(2000000);
        Assert.assertEquals(2, result, 0.0001);
    }

    @Test
    public void testKilogramToMilligram() {
        double result = WeightConverter.kilogramToMilligram(3.5);
        Assert.assertEquals(3500000, result, 0.0001);
    }
    @Test
    public void testPoundToKilogram() {
        double result = WeightConverter.poundToKilogram(10);
        Assert.assertEquals(4.53592, result, 0.0001);
    }

    @Test
    public void testKilogramToPound() {
        double result = WeightConverter.kilogramToPound(5.5);
        Assert.assertEquals(12.12542454, result, 0.0001);
    }
    @Test
    public void testPoundToGram() {
        double result = WeightConverter.poundToGram(2.75);
        Assert.assertEquals(1247.819, result, 0.001);
    }

    @Test
    public void testGramToPound() {
        double result = WeightConverter.gramToPound(2000);
        Assert.assertEquals(4.40924524, result, 0.0001);
    }


}


