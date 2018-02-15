package model;

public class NumberDigitEqualsSum {

    public static boolean equals(int number, int sum) {
        if (number < 0 || sum < 0) {
            View.print("You're not allowed to input negative numbers");
            return false;
        } else return (sum == sumRecurs(number));
    }

    public static int sumRecurs(int number) {
        if (number < 10) {
            return number;
        } else
            return number % 10 + sumRecurs(number / 10);
    }
}
