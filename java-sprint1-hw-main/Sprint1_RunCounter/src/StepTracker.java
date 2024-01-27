import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    MonthData monthData = new MonthData();
    int goalStepsPerDay;
    int[]newData = new int[3];

    void saveSteps() {

        System.out.println("Введите кол-во шагов:");
        int stepsQnt = scanner.nextInt();
        newData[0] = stepsQnt;

        System.out.println("За какой месяц хотите занести:");
        String[] months = {"Январь" , "Февраль" , "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + "-" + months[i]);
        }
        int month = scanner.nextInt();
        newData[1] = month;

        System.out.println("Введите за какой день месяца хотите занести:");
        int[] days = new int[30];
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        int day = scanner.nextInt();
        newData[2] = day;

        System.out.println("День " + days[day-1] + "-й, Месяц " + months[month-1] + ".");
        System.out.println("Вы прошли " + stepsQnt + " шагов.");
        monthData.saveMonthData(newData);
    }

    void changeDailyNormSteps() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша прежняя цель: " + goalStepsPerDay);
        System.out.println("Введите  новую цель: ");
        goalStepsPerDay = scanner.nextInt();
        System.out.println("Ваша новая цель шагов в день: " + goalStepsPerDay);
    }

    void showStatistic() {
        System.out.println("За какой месяц хотите узнать статистику?");
        String[] months = {"Январь" , "Февраль" , "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + "-" + months[i]);
        }
        int month = scanner.nextInt();
        int sumStepsAskedMonth = monthData.counterStatisticMonth(month);
        System.out.println("За " + months[month-1] + " Вы прошли " + sumStepsAskedMonth + " шагов.");
    }

}