package ru.netology.bonus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void calculateSum() {
        StatisticService service = new StatisticService();

        long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
        long expected = 10_500;

        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
}