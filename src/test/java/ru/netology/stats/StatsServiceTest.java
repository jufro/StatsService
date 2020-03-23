package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldFindTotalSum() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.findTotalSum(monthSales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldFindAverageSum() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverageSum(monthSales);
        assertEquals(expected, actual);
    }
}
