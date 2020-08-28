package ru.netology.bonus;

public class StatisticService {
    public long calculateSum(long[] purchases) {
        long sum = 0;

        for (long purchase : purchases) {
            sum += purchase;
        }

        return sum;
    }
}
