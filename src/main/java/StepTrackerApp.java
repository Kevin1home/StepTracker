package main.java;

import java.util.Scanner;

/**
 * Entry point for the Step Tracker application.
 *
 * Provides a console menu for recording steps,
 * adjusting goals, and viewing statistics.
 */

public class StepTrackerApp {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker(SCANNER);

        System.out.println("\nДобро пожаловать!");
        System.out.println("Какая Ваша цель кол-ва шагов в день?");
        stepTracker.setDailyGoal(SCANNER.nextInt());

        while(true) {
            showMenu();
            int command = SCANNER.nextInt();

            switch (command) {
                case 1 -> {
                    System.out.println("\nВыполняется команда 1\n");
                    stepTracker.saveSteps();
                }
                case 2 -> {
                    System.out.println("\nВыполняется команда 2\n");
                    stepTracker.changeDailyNormSteps();
                }
                case 3 -> {
                    System.out.println("\nВыполняется команда 3\n");
                    stepTracker.showStatistic();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Такого действия нет.");
                    System.out.println("Выберите снова.");
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nВыберите действие: ");
        System.out.println("1 - Ввести пройденные шаги за день");
        System.out.println("2 - Изменить цель кол-ва шагов в день");
        System.out.println("3 - Показать статистику за месяц");
        System.out.println("0 - Выход");
    }
}