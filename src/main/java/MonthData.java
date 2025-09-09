package main.java;

public class MonthData {
    int[][] stepsData  = new int[12][31]; // 12 months × 31 days

    /**
     * Saves step data for a given day.
     *
     * @param newData format: {steps, month, day}
     */
    void saveMonthData(int[] newData) {
        int steps = newData[0];
        int month = newData[1] - 1;
        int day = newData[2] - 1;
        stepsData[month][day] += steps;
    }

    /**
     * Returns all step data for a given month.
     */
    public int[] getMonthData(int month) {
        return stepsData[month - 1];
    }
}
