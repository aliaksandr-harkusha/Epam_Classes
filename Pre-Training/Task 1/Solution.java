public class Solution {

    static int KILOS_TO_GRAMS = 1000;
    static int TONS_TO_GRAMS = 1_000_000;
    static double LENGTH_OF_6_DIGITS_NUMBER = 6.0;

    public static void main(String[] args) {

        Solution s = new Solution();
        s.calculatorDinoMassToKilos(10002.2); // 1. Динозавр
        s.calculatorDinoMassToTons(10002.2); // 1. Динозавр
        s.calculatorDonutArea(23, 15); //2. Площадь кольца
        s.intSwitcher(15, 99); //3. Переброс переменных
        s.numberIncreaseChecker(1357); //4. 4х-значная возрастаемость/убываемость
        s.calculatorSumOf5DigitsNumber(11112); //5. Сумма цифр пятизначного числа
        s.calculatorMultiplOf5DigitsNumber(11112); //5. Произведение цифр пятизначного числа
        s.arithAveOf6DigitsNumber(368945); //6. Арифметическое среднее число 6тизначного числа
        s.arithGeoOf6DigitsNumber(368945); //6. Геометрическое среднее число 6тизначного числа
        s.reverse7DigitsNumber(1928374); //7. Реверз 7ми значного числа
    }

    // 1. Задача №1 - Динозавр - в килограмы
    public double calculatorDinoMassToKilos(double grams) {
        return grams / KILOS_TO_GRAMS;
    }

    // 1. Задача №1 - Динозавр - в тонны
    public double calculatorDinoMassToTons(double grams) {
        return grams / TONS_TO_GRAMS;
    }

    //2. Задача №2 - Площадь кольца
    public double calculatorDonutArea(double radius1, double radius2) {
        return Math.PI * (calculatorSquare(radius1) - calculatorSquare(radius2));
    }

    //method-helper for Task2
    public double calculatorSquare(double number) {
        return number * number;
    }

    //3. Задача №3 - Переброс переменных
    public void intSwitcher(int a, int b) {
        System.out.println("Задача №3 - Переброс переменных " + a + " и " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Новая переменная a = " + a + ", новая переменная b = " + b + "\n");
    }

    //4. Задача №4 - 4х-значная возрастаемость/убываемость
    public boolean numberIncreaseChecker(int numberToCheck) {
        int d4 = numberToCheck % 10;
        int d3 = (numberToCheck /= 10) % 10;
        int d2 = (numberToCheck /= 10) % 10;
        int d1 = (numberToCheck /= 10) % 10;

        return (d4 < d3 && d3 < d2 && d2 < d1);
    }

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

    //6. Задача №6 - Арифметическое среднее цифр 6тизначного числа
    public double arithAveOf6DigitsNumber(int number6Digits) {

        int d6 = number6Digits % 10;
        int d5 = (number6Digits /= 10) % 10;
        int d4 = (number6Digits /= 10) % 10;
        int d3 = (number6Digits /= 10) % 10;
        int d2 = (number6Digits /= 10) % 10;
        int d1 = (number6Digits /= 10) % 10;
        
        return (d1 + d2 + d3 + d4 + d5 + d6) / LENGTH_OF_6_DIGITS_NUMBER;
    }

    //6. Задача №6 - Геометрическое среднее цифр 6тизначного числа
    public double arithGeoOf6DigitsNumber(int number6Digits) {

        int d6 = number6Digits % 10;
        int d5 = (number6Digits /= 10) % 10;
        int d4 = (number6Digits /= 10) % 10;
        int d3 = (number6Digits /= 10) % 10;
        int d2 = (number6Digits /= 10) % 10;
        int d1 = (number6Digits /= 10) % 10;
        
        return Math.pow(d1 * d2 * d3 * d4 * d5 * d6, 1.0 / LENGTH_OF_6_DIGITS_NUMBER);
    }

    //7. Задача №7 - Реверз 7ми значного числа
    public int reverse7DigitsNumber(int number7Digits) {
        String intToReverse = Integer.toString(number7Digits); //перевод значения в строку
        StringBuilder reverser = new StringBuilder(intToReverse).reverse(); //разворот строки
        
        return Integer.parseInt(reverser.toString());
    }
}
