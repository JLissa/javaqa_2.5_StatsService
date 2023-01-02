package ru.netology.stats;

public class StatsService {
    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesPerMonth(int[] sales) {
        int sum = sumOfAllSales(sales);
        return sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth++;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth++;
    }

    public int quantityOfMonthUnderAverage(int [] sales) {
        int average = averageSalesPerMonth(sales);
        int quantityOfMonth = 0;

        for (int sale: sales) {
            if (sale < average)
                quantityOfMonth++;
        }
        return quantityOfMonth;
    }

    public int quantityOfMonthOverAverage(int [] sales) {
        int average = averageSalesPerMonth(sales);
        int quantityOfMonth = 0;

        for (int sale: sales) {
            if (sale > average)
                quantityOfMonth++;
        }
        return quantityOfMonth;
    }
}