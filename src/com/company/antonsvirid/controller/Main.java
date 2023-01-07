package com.company.antonsvirid.controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will displays the sign of the Zodiac, corresponding to selected date.");
        System.out.println("Please, input day of your date: ");
        int day = scanner.nextInt();
        System.out.println("Please, input month of your date: ");
        int month = scanner.nextInt();
        String zodiac = "Your date is not correct, please restart program and try again.";
        String result = "Your date is not correct, please restart program and try again.";

        if (month <= 12) {
            if (month == 1 & day >= 20 & day <= 31 || month == 2 & day <= 18) {
                zodiac = "Aquarius";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 2 & day >= 19 & day <= 28 || month == 3 & day <= 20) {
                zodiac = "Pisces";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 3 & day >= 21 & day <= 31 || month == 4 & day <= 19) {
                zodiac = "Aries";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 4 & day >= 20 & day <= 30 || month == 5 & day <= 20) {
                zodiac = "Taurus";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 5 & day >= 21 & day <= 31 || month == 6 & day <= 21) {
                zodiac = "Twins";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 6 & day >= 22 & day <= 30 || month == 7 & day <= 22) {
                zodiac = "Cancer";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 7 & day >= 23 & day <= 31 || month == 8 & day <= 22) {
                zodiac = "Leo";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 8 & day >= 23 & day <= 31 || month == 9 & day <= 22) {
                zodiac = "Virgo";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 9 & day >= 23 & day <= 30 || month == 10 & day <= 22) {
                zodiac = "Libra";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 10 & day >= 23 & day <= 31 || month == 11 & day <= 22) {
                zodiac = "Scorpio";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 11 & day >= 23 & day <= 30 || month == 12 & day <= 21) {
                zodiac = "Sagittarius";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            } else if (month == 12 & day >= 22 & day <= 31 || month == 1 & day <= 19) {
                zodiac = "Capricorn";
                result = "For date " + day + "." + month + ".YEAR Zodiac is " + zodiac;
            }

        } else {
            System.out.println(zodiac);
        }

        System.out.println(result);

        scanner.close();
    }
}


