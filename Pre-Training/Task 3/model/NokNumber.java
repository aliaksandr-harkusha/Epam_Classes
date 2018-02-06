package model;

public class NokNumber {

    //найти НОК двух натуральных чисел a и b.
    public static long getNokNumber(int numberOne, int numberTwo) {
        return (numberOne * numberTwo) / NodNumber.getNodNumber(numberOne, numberTwo);
    }
}
