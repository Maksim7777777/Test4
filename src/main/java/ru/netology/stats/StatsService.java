package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;

    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = sales[i];
                maximumMonth = i;
            }

        }
        return maximumMonth + 1;
    }

    public int minimum(long[] sales) {
        int minimumMonth = 0;
        long minimumSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumSale = sales[i];
                minimumMonth = i;
            }

        }
        return minimumMonth + 1;
    }

    public int bellowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }

        }
        return counter;
    }
}





