package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VacationTest {

    @Test

    public void testVacationCount() {
        Vacation vacation = new Vacation();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int actual = vacation.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void testVacationCount_1() {
        Vacation vacation = new Vacation();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = vacation.calculate(income, expenses, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
}
}
