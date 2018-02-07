public class Manipulator5DigitsNumbers {

    //5. Задача №5 - Сумма цифр пятизначного числа
    public int calculatorSumOf5DigitsNumber(int number5Digits) {

        int d5 = (number5Digits /= 10) % 10;
        int d4 = (number5Digits /= 10) % 10;
        int d3 = (number5Digits /= 10) % 10;
        int d2 = (number5Digits /= 10) % 10;
        int d1 = (number5Digits /= 10) % 10;

        return d1 + d2 + d3 + d4 + d5;
    }


    //5. Задача №5 - Произведение цифр пятизначного числа
    public int calculatorMultiplOf5DigitsNumber(int number5Digits) {

        int d5 = (number5Digits /= 10) % 10;
        int d4 = (number5Digits /= 10) % 10;
        int d3 = (number5Digits /= 10) % 10;
        int d2 = (number5Digits /= 10) % 10;
        int d1 = (number5Digits /= 10) % 10;

        return d1 * d2 * d3 * d4 * d5;
    }
}
