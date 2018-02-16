ackage controller;

import model.*;
import view.ViewTaskTwo;

public class TestTaskTwo {

    public static int DRAGON_AGE = 350;
    public static String TODAY = "2013_10_02"; //YYYY_MM_DD format
    public static char CHARACT = 'ё';

    public static void main(String[] args) {
        ViewTaskTwo.print("Dragon, which is " + DRAGON_AGE + " years old, has " +
                Dragon.dragonAgeFinder(DRAGON_AGE) + " heads and " + Dragon.dragonEyesCounter(DRAGON_AGE) + " eyes");

        ViewTaskTwo.print("Today you fell like - ");
        MoodSensor.moodSensor();

        ViewTaskTwo.print("Let's convert some up to 1000 number to words:");
        NumberToStringFormat.digitToStringConverterEasyENG();

        ViewTaskTwo.print("If today is " + TODAY + " then:");
        TomorrowDay.tomorrowFinder(TODAY);

        ViewTaskTwo.print("True or false: " + CHARACT + " is vowel?");
        ViewTaskTwo.print(VowelVSConsonant.isVowelCheckerV1(CHARACT));
    }
}
