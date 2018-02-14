package model;

public class NokNumber {

    //найти НОК двух натуральных чисел a и b.
    public static long calculateNokNumber(int numberOne, int numberTwo) {
        return (numberOne * numberTwo) / NodNumber.calculateNodNumber(numberOne, numberTwo);
    }
}
