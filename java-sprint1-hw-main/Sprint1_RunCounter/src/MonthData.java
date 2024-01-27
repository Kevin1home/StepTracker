public class MonthData {
    int[][] stepsMonths = new int[12][30];

    void saveMonthData(int[] newData) {
       stepsMonths[newData[1]-1][newData[2]-1] = stepsMonths[newData[1]-1][newData[2]-1] + newData[0]; // int[]{stepsQnt, month, day};
    }

    int counterStatisticMonth(int month) {
        int sumStepsAskedMonth = 0;
        int[] askedMonth = stepsMonths[month - 1];

        for (int j : askedMonth) {
            sumStepsAskedMonth += j;
        }
        return sumStepsAskedMonth;
    }
}
