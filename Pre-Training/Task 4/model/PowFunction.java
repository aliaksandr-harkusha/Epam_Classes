package model;

public class PowFunction {

    public static double calculatePow(double number, int number2) {
        if (number == 0) {
            System.out.println("Please, don't use 0 as a first input number");
            return 0;
        } else if (number2 == 0) return 1;
        else if (number2 > 0) return number * calculatePow(number, number2 - 1);
        else return 1 / (number * calculatePow(number, -number2 - 1));
    }
}
