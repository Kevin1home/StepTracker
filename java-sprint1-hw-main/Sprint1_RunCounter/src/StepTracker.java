import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);

    int[] saveSteps() {

        System.out.println("Введите кол-во шагов:");
        int stepsQnt = scanner.nextInt();

        System.out.println("За какой месяц хотите занести:");
        String[] months = {"Январь" , "Февраль" , "Март"};
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + "-" + months[i]);
        }
        int month = scanner.nextInt();

        System.out.println("Введите за какой день месяца хотите занести:");
        int[] days = new int[30];
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        int day = scanner.nextInt();

        System.out.println("День " + days[day-1] + "-й, Месяц " + months[month-1] + ".");
        System.out.println("Вы прошли " + stepsQnt + "шагов.");

        return new int[]{stepsQnt, day, month};
    }

    int changeDailyNormSteps(int goalStepsPerDay) {
        System.out.println("Ваша прежняя цель: " + goalStepsPerDay);
        System.out.println("Введите  новую цель: ");
        goalStepsPerDay = scanner.nextInt();
        System.out.println("Ваша новая цель шагов в день: " + goalStepsPerDay);
        return goalStepsPerDay;
    }

}
