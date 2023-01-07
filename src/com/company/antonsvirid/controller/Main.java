package com.company.antonsvirid.controller;

import com.company.antonsvirid.model.ZodiacCalculator;
import com.company.antonsvirid.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will displays the sign of the Zodiac, corresponding to selected date.");

        System.out.println("Please, input day of your date: ");
        int day = scanner.nextInt();
        System.out.println("Please, input month of your date: ");
        int month = scanner.nextInt();

        String result = ZodiacCalculator.calculatorOfDate(day, month);

        Printer.print(result);

        scanner.close();
    }
}


