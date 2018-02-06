package controller;
import model.*;
import view.View;

public class Test {

    public static void main(String[] args) {
        int number = 194221;
        System.out.println("Task 1. If we flip a coin 1000 times, we get this \"heads\" and \"tails\" distribution:");
        HeadsOrTails.coinFlipper();

        System.out.println("\nTask 2. Let's get a number " + number + ". Is it palidromic? True or false:");
        View.print(IsNumberPalindrom.isNumberPalindrom(number));

        System.out.println("\nTask 3. Same number, is it a perfect number? True or false:");
        View.print(IsNumberPerfect.isNumberPerfect(number));

        System.out.println("\nTask 4. Same number, this time - is is a simple number? True or false:");
        View.print(IsNumberSimple.isNumberSimple(number));

    }
}
