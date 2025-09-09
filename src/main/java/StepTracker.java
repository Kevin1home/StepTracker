package main.java;

import java.util.Scanner;

/**
 * Manages user interactions and step data recording.
 */
public class StepTracker {
    private final Scanner scanner;
    private final MonthData monthData = new MonthData();
    private int dailyGoal = 10000;
    private final String[] months = {"Январь" , "Февраль" , "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Records the number of steps for a given day and month.
     */
    public void saveSteps() {

        System.out.println("Введите кол-во шагов:");
        int steps = scanner.nextInt();

        System.out.println("\nЗа какой месяц хотите занести:");
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + "-" + months[i]);
        }
        int month = scanner.nextInt();

        System.out.println("\nВведите за какой день месяца хотите занести (1-31):");
        int day = scanner.nextInt();

        System.out.println("\nДень " + day + "-й, Месяц " + months[month-1] + ".");
        System.out.println("Вы прошли " + steps + " шагов.");
        monthData.saveMonthData(new int[]{steps, month, day});
    }

    /**
     * Allows user to update the daily step goal.
     */
    public void changeDailyNormSteps() {
        System.out.println("Ваша прежняя цель: " + dailyGoal);
        System.out.println("Введите  новую цель: ");
        dailyGoal = scanner.nextInt();
        System.out.println("Ваша новая цель шагов в день: " + dailyGoal);
    }

    /**
     * Displays statistics for a given month.
     */
    public void showStatistic() {
        System.out.println("За какой месяц хотите узнать статистику?");
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + "-" + months[i]);
        }
        int month = scanner.nextInt();

        StatisticsService stats = new StatisticsService(monthData, dailyGoal);
        stats.printMonthlyReport(month);
    }

    public void setDailyGoal(int goal) {
        this.dailyGoal = goal;
    }
}