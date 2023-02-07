package com.company.antonsvirid.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ZodiacCalculatorTest {

    @Test
    public void testCalculatorOfDateForTaurusInMay() throws Exception {
        int day = 11;
        int month = 5;

        String expected = "For date 11.5.YEAR Zodiac is Taurus";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForTaurusInApril() throws Exception {
        int day = 28;
        int month = 4;

        String expected = "For date 28.4.YEAR Zodiac is Taurus";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }


    @Test
    public void testCalculatorOfDateForCancerInJune() throws Exception {
        int day = 29;
        int month = 6;

        String expected = "For date 29.6.YEAR Zodiac is Cancer";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForCancerInJuly() throws Exception {
        int day = 9;
        int month = 7;

        String expected = "For date 9.7.YEAR Zodiac is Cancer";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForPiscesInFebruary() throws Exception {
        int day = 23;
        int month = 2;

        String expected = "For date 23.2.YEAR Zodiac is Pisces";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForPiscesInMarch() throws Exception {
        int day = 2;
        int month = 3;

        String expected = "For date 2.3.YEAR Zodiac is Pisces";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }


    @Test
    public void testCalculatorOfDateForAquariusInJanuary() throws Exception {
        int day = 27;
        int month = 1;

        String expected = "For date 27.1.YEAR Zodiac is Aquarius";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForAquariusInFebryary() throws Exception {
        int day = 7;
        int month = 2;

        String expected = "For date 7.2.YEAR Zodiac is Aquarius";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForAriesInMarch() throws Exception {
        int day = 21;
        int month = 3;

        String expected = "For date 21.3.YEAR Zodiac is Aries";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForAriesInApril() throws Exception {
        int day = 2;
        int month = 4;

        String expected = "For date 2.4.YEAR Zodiac is Aries";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForTwinsInMay() throws Exception {
        int day = 24;
        int month = 5;

        String expected = "For date 24.5.YEAR Zodiac is Twins";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForTwinsInJune() throws Exception {
        int day = 4;
        int month = 6;

        String expected = "For date 4.6.YEAR Zodiac is Twins";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForLeoInJuly() throws Exception {
        int day = 25;
        int month = 7;

        String expected = "For date 25.7.YEAR Zodiac is Leo";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForLeoInAugust() throws Exception {
        int day = 21;
        int month = 8;

        String expected = "For date 21.8.YEAR Zodiac is Leo";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForVirgoInAugust() throws Exception {
        int day = 24;
        int month = 8;

        String expected = "For date 24.8.YEAR Zodiac is Virgo";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForVirgoInSeptember() throws Exception {
        int day = 4;
        int month = 9;

        String expected = "For date 4.9.YEAR Zodiac is Virgo";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForLibraInSeptember() throws Exception {
        int day = 24;
        int month = 9;

        String expected = "For date 24.9.YEAR Zodiac is Libra";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForLibraInOctober() throws Exception {
        int day = 6;
        int month = 10;

        String expected = "For date 6.10.YEAR Zodiac is Libra";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForScorpioInOctober() throws Exception {
        int day = 26;
        int month = 10;

        String expected = "For date 26.10.YEAR Zodiac is Scorpio";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForScorpioInNovember() throws Exception {
        int day = 16;
        int month = 11;

        String expected = "For date 16.11.YEAR Zodiac is Scorpio";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForSagittariusInNovember() throws Exception {
        int day = 28;
        int month = 11;

        String expected = "For date 28.11.YEAR Zodiac is Sagittarius";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }


    @Test
    public void testCalculatorOfDateForSagittariusInDecember() throws Exception {
        int day = 19;
        int month = 12;

        String expected = "For date 19.12.YEAR Zodiac is Sagittarius";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForCapricornInDecember() throws Exception {
        int day = 29;
        int month = 12;

        String expected = "For date 29.12.YEAR Zodiac is Capricorn";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForCapricornInJanuary() throws Exception {
        int day = 9;
        int month = 1;

        String expected = "For date 9.1.YEAR Zodiac is Capricorn";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }



    @Test(expected = Exception.class)
    public void testCalculatorOfDateForException() throws Exception {
        int day = 4;
        int month = 13;

        String actual = ZodiacCalculator.calculatorOfDate(day, month);
    }

}
