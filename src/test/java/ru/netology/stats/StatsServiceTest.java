package ru.netology.stats;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void sumOfAllSalesTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        StatsService statsService = new StatsService();
        int actual = statsService.sumOfAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void averageSalesPerMonthTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        StatsService statsService = new StatsService();
        int actual = statsService.averageSalesPerMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        StatsService statsService = new StatsService();
        int actual = statsService.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        StatsService statsService = new StatsService();
        int actual = statsService.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void quantityOfMonthUnderAverageTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        StatsService statsService = new StatsService();
        int actual = statsService.quantityOfMonthUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void quantityOfMonthOverAverageTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        StatsService statsService = new StatsService();
        int actual = statsService.quantityOfMonthOverAverage(sales);
        assertEquals(expected, actual);
    }
}
