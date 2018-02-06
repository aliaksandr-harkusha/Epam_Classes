package Task3;

public class IsNumberPalindrom {

    //проверить, является ли заданное натуральное число палиндромом
    public boolean isNumberPalindrom(int numberToCheck) {
        String stringNumberToCheck = Integer.toString(numberToCheck); //перевод значения в строку
        StringBuilder reverser = new StringBuilder(stringNumberToCheck).reverse(); //разворот строки
        String reverseNumber = new String(reverser.toString());
        return reverseNumber.equals(stringNumberToCheck);
    }
}
