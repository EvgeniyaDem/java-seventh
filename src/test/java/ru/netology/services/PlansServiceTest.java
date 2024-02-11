package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlansServiceTest {
    @Test
    public void firstOption() {
        PlansService service = new PlansService();
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondOption() {
        PlansService service = new PlansService();
        int income = 100_000;
        int expenses = 60_000;
        int treshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }
}
