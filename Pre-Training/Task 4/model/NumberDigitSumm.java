package model;

public class NumberDigitSumm {

    public static int calculateSumRecurs(int number) {
        if (number < 10) {
            return number;
        } else
            return number % 10 + sumRecurs(number / 10);
    }
}
