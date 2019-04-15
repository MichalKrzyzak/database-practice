package com.myproject.generator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

public class Pesel {
    private final List<String> longerMonths = Arrays.asList("01", "03", "05", "07", "08", "10", "12");
    private Random r = new Random();

    private String getYear() {
        return Integer.toString(r.nextInt(2000 - 1900 + 1) + 1900);
    }

    private String getMonth() {
        int b;
        int a = r.nextInt(2);

        do {
            if (a == 0) {
                b = r.nextInt(10);
            } else {
                b = r.nextInt(3);
            }
        } while (a + b == 0);

        String monthNumber1 = Integer.toString(a);
        String monthNumber2 = Integer.toString(b);

        return (monthNumber1 + monthNumber2);
    }

    private String getDay() {
        int b = 0;
        int a = r.nextInt(4);

        do {
            if (a == 0 || a == 1) {
                b = r.nextInt(10);
            } else if (longerMonths.contains(getMonth())) {
                b = 0;
            } else if (a == 2 && getMonth().equals("02")) {
                b = r.nextInt(9);
            } else if (a == 2 && !getMonth().equals("02")) {
                b = r.nextInt(10);
            }
        } while (a + b == 0);

        String day1 = Integer.toString(a);
        String day2 = Integer.toString(b);

        return (day1 + day2);
    }

    private String getRandoms() {
        int a = r.nextInt(10000);
        String number = Integer.toString(a);
        int b = number.length();

        if (b == 1) {
            number = "000" + number;
        } else if (b == 2) {
            number = "00" + number;
        } else if (b == 3) {
            number = "0" + number;
        }

        return (number);
    }

    private String calculateControlNumber(String str) {
        int edit;
        int result = 0;
        int[] tab = new int[10];
        int[] tab1 = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        for (int i = 0; i <= 9; i++) {
            edit = Character.getNumericValue(str.charAt(i));
            tab[i] = edit;
        }

        for (int x = 0; x < 10; x++) {
            result += tab[x] * tab1[x];
        }

        result = result % 10;
        result = 10 - result;
        result = result % 10;

        str = Integer.toString(result);

        return (str);
    }

    public String getPesel() {
        String year = getYear();
        String month = getMonth();
        String day = getDay();
        String number = getRandoms();

        int control = Integer.parseInt(month);
        int year_sp = Integer.parseInt(year);

        if ((2000 < year_sp) && (year_sp < 2099)) {
            control += 20;
            month = Integer.toString(control);
        } else {
            if (control < 10) {
                month = "0" + control;
            }
        }

        year = year.substring(2);
        String enternance = year + month + day + number;
        String str = calculateControlNumber(enternance);

        return (year + month + day + number + str);
    }
}