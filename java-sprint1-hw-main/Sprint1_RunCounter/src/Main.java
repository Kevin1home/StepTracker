import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker();
        MonthData monthData = new MonthData();

        System.out.println("Добро пожаловать!");
        System.out.println("Какая Ваша цель кол-ва шагов в день?");
        int goalStepsPerDay = scanner.nextInt();
        while(true) {
            showMenu();
            int command = scanner.nextInt();
                if (command == 0) {
                    break;
                }
            goalStepsPerDay = selectMenu(command, goalStepsPerDay, stepTracker, monthData);
        }
    }

    static void showMenu() {
        System.out.println("Выберите действие: ");
        System.out.println("1 - Ввести пройденные шаги за день");
        System.out.println("2 - Изменить цель кол-ва шагов в день");
        System.out.println("3 - Показать статистику за месяц");
        System.out.println("0 - Выход");
    }

    static int selectMenu(int command, int goalStepsPerDay, StepTracker stepTracker, MonthData monthData) {

        while (true) {
            if(command == 1) {
                monthData.saveMonthData();
                break;
            }
            else if(command == 2) {
                goalStepsPerDay = stepTracker.changeDailyNormSteps(goalStepsPerDay);
                return goalStepsPerDay;
            }
            else if(command == 3) {
                monthData.counterStatisticMonth();
                break;
            }
            else {
                System.out.println("Такого действия нет.");
                System.out.println("Выберите снова.");
            }
        }
        return goalStepsPerDay;
    }
}