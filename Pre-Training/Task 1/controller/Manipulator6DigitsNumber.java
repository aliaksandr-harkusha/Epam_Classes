package controller;

public class Manipulator6DigitsNumber {
    
    static double LENGTH_OF_6_DIGITS_NUMBER = 6.0;

    //6. Задача №6 - Арифметическое среднее цифр 6тизначного числа
    public static double arithAveOf6DigitsNumber(int number6Digits) {

        int d6 = number6Digits % 10;
        int d5 = (number6Digits /= 10) % 10;
        int d4 = (number6Digits /= 10) % 10;
        int d3 = (number6Digits /= 10) % 10;
        int d2 = (number6Digits /= 10) % 10;
        int d1 = number6Digits  % 10;

        return (d1 + d2 + d3 + d4 + d5 + d6) / LENGTH_OF_6_DIGITS_NUMBER;
    }

    //6. Задача №6 - Геометрическое среднее цифр 6тизначного числа
    public static double arithGeoOf6DigitsNumber(int number6Digits) {

        int d6 = number6Digits % 10;
        int d5 = (number6Digits /= 10) % 10;
        int d4 = (number6Digits /= 10) % 10;
        int d3 = (number6Digits /= 10) % 10;
        int d2 = (number6Digits /= 10) % 10;
        int d1 = number6Digits % 10;

        return Math.pow(d1 * d2 * d3 * d4 * d5 * d6, 1.0 / LENGTH_OF_6_DIGITS_NUMBER);
    }
}
