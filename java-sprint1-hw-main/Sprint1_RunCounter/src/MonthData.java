import java.util.Scanner;

public class MonthData {
    int[] stepsJanuary = new int[30];
    int[] stepsFebruary = new int[30];
    int[] stepsMarch = new int[30];
    Scanner scanner = new Scanner(System.in);

    void saveMonthData() {

        StepTracker stepTracker = new StepTracker();
        int[] nData = stepTracker.saveSteps();

        if (nData[2] == 1) {
            for (int i = 0; i < stepsJanuary.length; i++) {
                if (nData[1] - 1 == i) {
                    stepsJanuary[i] = nData[0];
                }
            }
        }
        else if (nData[2] == 2) {
            for (int i = 0; i < stepsFebruary.length; i++) {
                if (nData[1] - 1 == i) {
                    stepsFebruary[i] = nData[0];
                }
            }
        }
        else if (nData[2] == 3) {
            for (int i = 0; i < stepsMarch.length; i++) {
                if (nData[1] - 1 == i) {
                    stepsMarch[i] = nData[0];
                }
            }
        }
    }

    void counterStatisticMonth() {
        System.out.println("За какой месяц хотите узнать статистику?");
        String[] months = {"Январь" , "Февраль" , "Март"};
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + "-" + months[i]);
        }
        int month = scanner.nextInt();
        int sumStepsJanuary = 0;
        int sumStepsFebruary = 0;
        int sumStepsMarch = 0;
        if(month == 1) {
            for (int i = 0; i < stepsJanuary.length; i++) {
                sumStepsJanuary = sumStepsJanuary + stepsJanuary[i];
            }
            System.out.println("За январь Вы прошли " + sumStepsJanuary + " шагов.");
        }
        else if (month == 2) {
            for(int i = 0; i < stepsFebruary.length; i++) {
                sumStepsFebruary = sumStepsFebruary + stepsFebruary[i];
            }
            System.out.println("За февраль Вы прошли " + sumStepsJanuary + " шагов.");
        }
        else if (month == 3) {
            for(int i = 0; i < stepsMarch.length; i++) {
                sumStepsMarch = sumStepsMarch + stepsMarch[i];
            }
            System.out.println("За март Вы прошли " + sumStepsJanuary + " шагов.");
        }

    }
}
