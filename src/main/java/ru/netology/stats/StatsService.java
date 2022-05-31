package ru.netology.stats;


public class StatsService {
    public int sum(int[] monthlySales) {
        int sum = 0;
        for (int monthlySale : monthlySales) {
            sum += monthlySale;
        }
        return sum;
    }

    public int avms(int[] monthlySales) {
        int avms = 0;
        int sum = sum(monthlySales);
        avms = sum / monthlySales.length;
        return avms;
    }

    public int max(int[] monthlySales) {
        int maxMonth = 0;
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale >= monthlySales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int min(int[] monthlySales) {
        int minMonth = 0;
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale <= monthlySales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAvms(int[] monthlySales) {
        int minMonth = 0;
        int avms = avms(monthlySales);
        for (int monthlySale : monthlySales) {
            if (monthlySale < avms) {
                minMonth++;
            }
        }
        return minMonth;
    }

    public int aboveAvms(int[] monthlySales) {
        int minMonth = 0;
        int avms = avms(monthlySales);
        for (int monthlySale : monthlySales) {
            if (monthlySale > avms) {
                minMonth++;
            }
        }
        return minMonth;
    }
}