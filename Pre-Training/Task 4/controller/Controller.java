package controller;

public class Controller {

    public static void main(String[] args) {
        solverHanoiRunner(3, "A", "B", "C");
        starterFibonNumber(7);
        comparatorIfDigitsSumEqualNumber(12345678, 28);
        calculatorSumOfNumberDigits(152);
        exponentiator(2, 5);
    }

    public static void solverHanoiRunner(int pollAmount, String poleFrom, String poleTo, String poleHelper) {
        HanoiTower.solveHanoiTower(pollAmount, poleFrom, poleTo, poleHelper);
    }

    public static int starterFibonNumber(int number) {
        return FibonNum.calculatorFibonNum(0, 1, number);
    }

    public static boolean comparatorIfDigitsSumEqualNumber(int number, int digitsSumToCompare) {
        return NumberDigitEqualsSum.calculateIfEqual(number, digitsSumToCompare);
    }

    public static int calculatorSumOfNumberDigits(int number) {
        return NumberDigitSumm.calculateSumRecurs(1562);
    }

    public static double exponentiator(double number, int powerOf) {
        return PowFunction.calculatePow(number, powerOf);
    }
}
