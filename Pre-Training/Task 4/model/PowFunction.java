package model;

public class PowFunction {

    public static double pow(double number, int number2) {
        if (number == 0) {
            System.out.println("Please, don't use 0 as a first input number");
            return 0;
        } else if (number2 == 0) return 1;
        return number * pow(number, number2 - 1);
    }
}
