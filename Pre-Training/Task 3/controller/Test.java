package controller;

import model.*;
import view.View;

public class Test {

    public static void main(String[] args) {
        int numberOne = 26, numberTwo = 39;
        View.print("Task 1. If we flip a coin 1000 times, we get this \"heads\" and \"tails\" distribution:");
        HeadsOrTails.coinFlipper();

        View.print("\nTask 2. Let's get a number " + numberOne + ". Is it palidromic? True or false:");
        View.print(IsNumberPalindrom.isNumberPalindrom(numberOne));

        View.print("\nTask 3. Same number, is it a perfect number? True or false:");
        View.print(IsNumberPerfect.isNumberPerfect(numberOne));

        View.print("\nTask 4. Same number, this time - is is a simple number? True or false:");
        View.print(IsNumberSimple.isNumberSimple(numberOne));

        View.print("\nTask 5. Now let's see what's the biggest digit of this number:");
        View.print(MaxDigitOfANumber.getMaxDigitOfANumber(numberOne));

        View.print("\nTask 6. Easy ones now: NOD and NOK of number " + numberOne + " and " + numberTwo + ":");
        View.print(NodNumber.getNodNumber(numberOne, numberTwo));
        View.print(NokNumber.getNokNumber(numberOne, numberTwo));

        View.print("\nTask 7. Next step - what is a number of unique digits of number " + numberOne + "? And the answer is:");
        View.print(NumberOfDifferentDigits.numberOfDifferentDigits(numberOne));

        View.print("\nTask 8. Last but not least, simple dividers of this numbers:");
        ShowSimpleDividers.showSimpleDividers(numberOne);
    }
}
