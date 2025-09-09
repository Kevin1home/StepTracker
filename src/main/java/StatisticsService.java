package main.java;

import java.util.Arrays;

/**
 * Provides statistical analysis of step data.
 */
public class StatisticsService {
    private final MonthData monthData;
    private final int dailyGoal;

    public StatisticsService(MonthData monthData, int dailyGoal) {
        this.monthData = monthData;
        this.dailyGoal = dailyGoal;
    }

    /**
     * Prints a monthly report with totals, averages, and goal tracking.
     */
    public void printMonthlyReport(int month) {
        int[] steps = monthData.getMonthData(month);

        int total = Arrays.stream(steps).sum();
        int max = Arrays.stream(steps).max().orElse(0);
        double average = Arrays.stream(steps).average().orElse(0);

        System.out.println("\n--- Отчёт за месяц ---");
        System.out.println("Всего шагов: " + total);
        System.out.println("Максимальное кол-во шагов в день: " + max);
        System.out.printf("Среднее кол-во шагов в день: %.2f%n", average);

        long daysMeetingGoal = Arrays.stream(steps).filter(s -> s >= dailyGoal).count();
        System.out.println("Кол-во дней с достигнутой целью шагов (цель: " + dailyGoal + "): " + daysMeetingGoal);
    }
}