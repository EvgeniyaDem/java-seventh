package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class PlansServiceTest {
    @ParameterizedTest
    //@CsvSource({
    //    "10000, 3000, 20000, 3",
    //   "100000, 60000, 150000, 2"
    //})
    @CsvFileSource(files = "src/test/resources/plans.csv")
    public void firstOption(int income, int expenses, int treshold, int expected) {
        PlansService service = new PlansService();
        //int income = 10_000;
        //int expenses = 3_000;
        //int treshold = 20_000;
        //int expected = 3;
        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }


}
