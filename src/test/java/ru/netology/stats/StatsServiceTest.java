package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindAmountAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateAmountAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberMonthMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateNumberMonthMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberMonthMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateNumberMonthMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMonthSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateQuantityMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMonthSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateQuantityMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}



