package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж.
    public int calculateAmountAllSales(int[] sales) {

        int amount = 0;
        for (int sale : sales) {
            amount = amount + sale;
        }
        return amount;
    }

    // 2. Средняя сумма всех продаж в месяц.

    public int calculateAverageAmountSales(int[] sales) {

        int amountAllSales = calculateAmountAllSales(sales);
        int average = amountAllSales / sales.length;
        return average;
    }

    // 3. Номер месяца, в котором был пик продаж.

    public int calculateNumberMonthMaxSales(int[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж.
    public int calculateNumberMonthMinSales(int[] sales) {

        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего.

    public int calculateQuantityMonthSalesBelowAverage(int[] sales) {

        int quantityMonths = calculateAverageAmountSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < quantityMonths) {
                count++;
            }
        }
        return count;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего.

    public int calculateQuantityMonthSalesAboveAverage(int[] sales) {

        int quantityMonths = calculateAverageAmountSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > quantityMonths) {
                count++;
            }
        }
        return count;
    }

}