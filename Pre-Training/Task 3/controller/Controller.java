package controller;

import model.*;
import view.View;

public class Controller {

    public static int NUMBER_ONE = 18;
    public static int NUMBER_TWO = 39;

    public static void main(String[] args) {
        runTask1CoinsFlipper(NUMBER_ONE);
        runTask2IfPalindrome(NUMBER_ONE);
        runTask3IfPerfect(NUMBER_ONE);
        runTask4IfSimple(NUMBER_ONE);
        runTask5BiggestDigit(NUMBER_ONE);
        runTask6NodNok(NUMBER_ONE, NUMBER_TWO);
        runTask7NumberOfUniqueDigits(NUMBER_ONE);
    }

    public static void runTask1CoinsFlipper(int number) {
        View.print("Task 1. If we flip a coin " + number + " times, you'll have heads:");
        View.print(HeadsOrTails.countHeadsCoinFlipper(number) + " times");
    }

    public static void runTask2IfPalindrome(int number) {
        View.print("\nTask 2. Let's get a number " + number + ". Is it palidromic? True or false:");
        View.print(IsNumberPalindrom.checkIfNumberPalindrom(number));
    }

    public static void runTask3IfPerfect(int number) {
        View.print("\nTask 3. Same number, is it a perfect number? True or false:");
        View.print(IsNumberPerfect.checkIfNumberPerfect(number));
    }

    public static void runTask4IfSimple(int number) {
        View.print("\nTask 4. Same number, this time - is is a simple number? True or false:");
        View.print(IsNumberSimple.checkIfNumberSimple(number));
    }

    public static void runTask5BiggestDigit(int number) {
        View.print("\nTask 5. Now let's see what's the biggest digit of this number:");
        View.print(MaxDigitOfANumber.calculateMaxDigitOfANumber(number));
    }

    public static void runTask6NodNok(int numberOne, int numberTwo) {
        View.print("\nTask 6. Easy ones now: NOD and NOK of number " + numberOne + " and " + numberTwo + ":");
        View.print(NodNumber.calculateNodNumber(numberOne, numberTwo));
        View.print(NokNumber.calculateNokNumber(numberOne, numberTwo));
    }

    public static void runTask7NumberOfUniqueDigits(int number) {
        View.print("\nTask 7. Next step - what is a number of unique digits of number " + number + "? And the answer is:");
        View.print(NumberOfDifferentDigits.countNumberOfDifferentDigits(number));
    }

    public static void runTask8(int number) {
        View.print("\nTask 8. Last but not least, simple dividers of this numbers:");
        ShowSimpleDividers.calculateSimpleDividers(number);
    }
}
