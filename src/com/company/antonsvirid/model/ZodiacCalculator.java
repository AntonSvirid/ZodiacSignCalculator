package com.company.antonsvirid.model;

public class ZodiacCalculator {
    private static final String ZODIAC_AQUARIUS = "Aquarius";
    private static final String ZODIAC_PISCES = "Pisces";
    private static final String ZODIAC_ARIES = "Aries";
    private static final String ZODIAC_TAURUS = "Taurus";
    private static final String ZODIAC_TWINS = "Twins";
    private static final String ZODIAC_CANCER = "Cancer";
    private static final String ZODIAC_LEO = "Leo";
    private static final String ZODIAC_VIRGO = "Virgo";
    private static final String ZODIAC_LIBRA = "Libra";
    private static final String ZODIAC_SCORPIO = "Scorpio";
    private static final String ZODIAC_SAGITTARIUS = "Sagittarius";
    private static final String ZODIAC_CAPRICORN = "Capricorn";
    private static final String FOR_DATE = "For date ";
    private static final String ZODIAC_IS = ".YEAR Zodiac is ";

    public static String calculatorOfDate (int day, int month){
        String zodiac = "Your date is not correct, please restart program and try again.";
        String result = "Your date is not correct, please restart program and try again.";

        if (month <= 12) {
            if (month == 1 & day >= 20 & day <= 31 || month == 2 & day <= 18) {
                zodiac = ZODIAC_AQUARIUS;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 2 & day >= 19 & day <= 28 || month == 3 & day <= 20) {
                zodiac = ZODIAC_PISCES;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 3 & day >= 21 & day <= 31 || month == 4 & day <= 19) {
                zodiac = ZODIAC_ARIES;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 4 & day >= 20 & day <= 30 || month == 5 & day <= 20) {
                zodiac = ZODIAC_TAURUS;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 5 & day >= 21 & day <= 31 || month == 6 & day <= 21) {
                zodiac = ZODIAC_TWINS;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 6 & day >= 22 & day <= 30 || month == 7 & day <= 22) {
                zodiac = ZODIAC_CANCER;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 7 & day >= 23 & day <= 31 || month == 8 & day <= 22) {
                zodiac = ZODIAC_LEO;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 8 & day >= 23 & day <= 31 || month == 9 & day <= 22) {
                zodiac = ZODIAC_VIRGO;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 9 & day >= 23 & day <= 30 || month == 10 & day <= 22) {
                zodiac = ZODIAC_LIBRA;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 10 & day >= 23 & day <= 31 || month == 11 & day <= 22) {
                zodiac = ZODIAC_SCORPIO;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 11 & day >= 23 & day <= 30 || month == 12 & day <= 21) {
                zodiac = ZODIAC_SAGITTARIUS;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            } else if (month == 12 & day >= 22 & day <= 31 || month == 1 & day <= 19) {
                zodiac = ZODIAC_CAPRICORN;
                result = FOR_DATE + day + "." + month + ZODIAC_IS + zodiac;
            }

        } else {
            return zodiac;
        }

    return result;
    }
}
