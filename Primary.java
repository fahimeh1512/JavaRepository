package org.maktab37.HW5;

public class PrimaryNumber {
    private int number;

    public PrimaryNumber(int number) {
        this.number = number;
    }

    // Check number is sum of two primary number
    public String checkSumOfPrimaries() {
        int addNum1, addNum2;

        // Number is sum of addNum1 and addNum2
        for (int i = 2; i <= number / 2; i++) {
            addNum1 = i;
            addNum2 = number - i;

            if (isPrimary(addNum1) && isPrimary(addNum2))
                return addNum1 + " + " + addNum2 + " = " + number;
        }

        return number + " is not sum of primaries.";
    }

    // Check the number is primary
    public boolean isPrimary(int number) {
        if (number <= 1)
            return false;

        if (number == 2)
            return true;

        if (number % 2 == 0)
            return false;

        for (int i = 3; i <= number / 2; i+= 2) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
