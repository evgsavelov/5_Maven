package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    void calculateSum1() {
        StatsService service = new StatsService();
        int month[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 181;

        int actual = service.calculateSum1(month);
        assertEquals(actual,expected);
    }

}