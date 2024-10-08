package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vocation.csv")
    void monthToRelax(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

        System.out.println("You have: " + actual + " month to relax");
    }

}
