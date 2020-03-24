package ru.netology.stats;

public class StatsService {

    public int findTotalSum(int[] monthSales) {
        int sum = 0;
        for (int sale : monthSales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverageSum(int[] monthSales) {
        StatsService service = new StatsService();
        int sum = service.findTotalSum(monthSales);
        return (sum / monthSales.length);
    }

    public int findMaxSalesMonth(int[] monthSales) {
        int indexOfMonth = 0;
        int index = 0;
        int maxSales = monthSales[0];
        for (int sale: monthSales) {
            index += 1;
            if (maxSales < sale) {
                maxSales = sale;
                indexOfMonth = index;
            }
        }
        return indexOfMonth;
    }

    public int findMinSalesMonth(int[] monthSales) {
        int indexOfMonth = 0;
        int index = 0;
        int minSales = monthSales[0];
        for (int sale: monthSales) {
            index += 1;
            if (minSales > sale) {
                minSales = sale;
                indexOfMonth = index;
            }
        }
        return indexOfMonth;
    }

    public int findUnderAverageMonths(int[] monthSales) {
        StatsService service = new StatsService();
        int averageSum = service.findAverageSum(monthSales);
        int count = 0;
        for (int sale : monthSales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }

    public int findOverAverageMonths(int[] monthSales) {
        StatsService service = new StatsService();
        int averageSum = service.findAverageSum(monthSales);
        int count = 0;
        for (int sale : monthSales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }
}



