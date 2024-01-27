import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        System.out.println("Добро пожаловать!");
        System.out.println("Какая Ваша цель кол-ва шагов в день?");
        stepTracker.goalStepsPerDay = scanner.nextInt();

        while(true) {
            showMenu();
            int command = scanner.nextInt();
            if(command == 1) {
                System.out.println("Выполняется команда 1");
                stepTracker.saveSteps();
            }
            else if(command == 2) {
                System.out.println("Выполняется команда 2");
                stepTracker.changeDailyNormSteps();
            }
            else if(command == 3) {
                System.out.println("Выполняется команда 3");
                stepTracker.showStatistic();
            }
            else if (command == 0) {
                break;
            }
            else {
                System.out.println("Такого действия нет.");
                System.out.println("Выберите снова.");
            }
        }
    }

    static void showMenu() {
        System.out.println("Выберите действие: ");
        System.out.println("1 - Ввести пройденные шаги за день");
        System.out.println("2 - Изменить цель кол-ва шагов в день");
        System.out.println("3 - Показать статистику за месяц");
        System.out.println("0 - Выход");
    }
}