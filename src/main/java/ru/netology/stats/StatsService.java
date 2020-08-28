package ru.netology.stats;

public class StatsService {
    public int calculateSum1(int[] month){
        int sum = 0;
        for (int x:month){
            sum = sum + x;
        }
        return sum;
    }
}
