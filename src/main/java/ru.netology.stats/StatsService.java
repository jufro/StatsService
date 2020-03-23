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
        return (sum / 12);
    }
}





