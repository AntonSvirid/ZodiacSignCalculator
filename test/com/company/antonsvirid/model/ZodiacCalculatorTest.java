package com.company.antonsvirid.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ZodiacCalculatorTest {

    @Test
    public void testCalculatorOfDateForTaurus() throws Exception {
        int day = 11;
        int month = 5;

        String expected = "For date 11.5.YEAR Zodiac is Taurus";
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
    public void testCalculatorOfDateForPisces() throws Exception {
        int day = 23;
        int month = 2;

        String expected = "For date 23.2.YEAR Zodiac is Pisces";
        String actual = ZodiacCalculator.calculatorOfDate(day, month);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorOfDateForAquarius() throws Exception {
        int day = 27;
        int month = 1;

        String expected = "For date 27.1.YEAR Zodiac is Aquarius";
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
