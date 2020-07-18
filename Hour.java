package org.maktab37.HW5;
// Second edition
public class SandyHour {
    int number;
    int[][] array;

    // Initialization
    public SandyHour(int[][] array, int number) {
        this.number = number;
        this.array = new int[number][number];

        for (int i = 0; i < number; i++)
            for (int j = 0; j < number; j++)
                this.array[i][j] = array[i][j];
    }

    public int getMaxSandyHour() {
        int max = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < number - 2; i++) {
            for (int j = 0; j < number - 2; j++) {
                // If all elements of sandy hour are zero, it ignores it
                if (array[i][j] == 0 && array[i][j + 1] == 0 && array[i][j + 2] == 0 &&
                        array[i + 1][j + 1] == 0 && array[i + 2][j] == 0 && array[i + 2][j + 1] == 0 && array[i + 2][j + 2] == 0)
                    continue;
                // Calculate sum of sandy hour elements and compare it with maximum
                temp = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                max = Math.max(max, temp);
            }
        }

        return max;
    }
}
