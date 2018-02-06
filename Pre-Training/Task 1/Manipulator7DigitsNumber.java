package Task1;

public class Manipulator7DigitsNumber {

    //7. Задача №7 - Реверз 7ми значного числа
    public int reverse7DigitsNumber(int number7Digits) {
        String intToReverse = Integer.toString(number7Digits); //перевод значения в строку
        StringBuilder reverser = new StringBuilder(intToReverse).reverse(); //разворот строки

        return Integer.parseInt(reverser.toString());
    }
}
