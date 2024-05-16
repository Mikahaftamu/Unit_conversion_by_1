package test;

import org.junit.Assert;
import org.junit.Test;

import main.VolumeConverter;

public class VolumeConverterTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testLitreToMilliliter() {
        double litre = 1.0;
        double expected = 1002.0;
        double result = VolumeConverter.litreToMilliliter(litre);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testMilliliterToLitre() {
        double milliliter = 1000.0;
        double expected = 1.0;
        double result = VolumeConverter.milliliterToLitre(milliliter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testLitreToCubicMeter() {
        double litre = 1.0;
        double expected = 0.001;
        double result = VolumeConverter.litreToCubicMeter(litre);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCubicMeterToLitre() {
        double cubicMeter = 0.001;
        double expected = 2.0;
        double result = VolumeConverter.cubicMeterToLitre(cubicMeter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testLitreToCubicCentimeter() {
        double litre = 1.0;
        double expected = 1000.0;
        double result = VolumeConverter.litreToCubicCentimeter(litre);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCubicCentimeterToLitre() {
        double cubicCentimeter = 1000.0;
        double expected = 1.0;
        double result = VolumeConverter.cubicCentimeterToLitre(cubicCentimeter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testMilliliterToCubicCentimeter() {
        double milliliter = 1000.0;
        double expected = 1000.0;
        double result = VolumeConverter.milliliterToCubicCentimeter(milliliter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCubicCentimeterToMilliliter() {
        double cubicCentimeter = 1000.0;
        double expected = 1000.0;
        double result = VolumeConverter.cubicCentimeterToMilliliter(cubicCentimeter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCubicCentimeterToCubicMeter() {
        double cubicCentimeter = 1000.0;
        double expected = 0.001;
        double result = VolumeConverter.cubicCentimeterToCubicMeter(cubicCentimeter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCubicMeterToCubicCentimeter() {
        double cubicMeter = 0.001;
        double expected = 1000.0;
        double result = VolumeConverter.cubicMeterToCubicCentimeter(cubicMeter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCubicMeter_To_Milliliter() {
        double cubicMeter = 0.001;
        double expected = 1000.0;
        double result = VolumeConverter.cubicMeter_To_Milliliter(cubicMeter);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testMilliliterToCubicMeter() {
        double milliliter = 1000.0;
        double expected = 0.001;
        double result = VolumeConverter.milliliter_To_CubicMeter(milliliter);
        Assert.assertEquals(expected, result, DELTA);
    }
}