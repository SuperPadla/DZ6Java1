package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSum() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.sum(monthlySales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageMonthlySales() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.avms(monthlySales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.max(monthlySales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMin() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.min(monthlySales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBelowAvms() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.belowAvms(monthlySales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveAvms() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.aboveAvms(monthlySales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
