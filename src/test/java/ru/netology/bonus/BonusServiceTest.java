package ru.netology.bonus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @CsvSource(value = {
            "'registered user, bonus under limit',100060,true,30",
            "'registered user, bonus over limit',100000060,true,500",
            "'unregistered user, bonus under limit',100060,false,10",
            "'unregistered user, bonus over limit',100000060,true,500"
    }, delimiter = ',')
    @ParameterizedTest(name = "[{index}] {0}")
    void shouldCalculate(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void test() {
        String[] strings = {"кейс", "баг", "кот", "фыва", "авокадо"};


        for (String string : strings) {

        }
    }

}