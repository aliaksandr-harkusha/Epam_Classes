ackage controller;

import model.*;
import view.ViewTaskTwo;

public class TestTaskTwo {

    public static int DRAGON_AGE = 350;
    public static String TODAY = "2013_10_02"; //YYYY_MM_DD format
    public static char CHARACT = 'ё';

    public static void main(String[] args) {
        finderDragonAge(DRAGON_AGE);
        senseYourMood();
        convertDigitToEngString();
        findTomorrowDay(TODAY);
        checkCharacterIsVowel(CHARACT);
    }


    public static void finderDragonAge(int dragonAge) {
        ViewTaskTwo.print("Dragon, which is " + dragonAge + " years old, has " +
                Dragon.dragonAgeFinder(dragonAge) + " heads and " + Dragon.dragonEyesCounter(dragonAge) + " eyes");
    }

    public static void senseYourMood() {
        ViewTaskTwo.print("Today you fell like - ");
        ViewTaskTwo.print(MoodSensor.moodSensor());
    }

    public static void convertDigitToEngString() {
        ViewTaskTwo.print("Let's convert some up to 1000 number to words:");
        NumberToStringFormat.digitToStringConverterEasyENG();
    }

    public static void findTomorrowDay(String today) {
        ViewTaskTwo.print("If today is " + today + " then:");
        ViewTaskTwo.print(TomorrowDay.tomorrowFinder(today));
    }

    public static void checkCharacterIsVowel(char character) {
        ViewTaskTwo.print("True or false: " + character + " is vowel?");
        ViewTaskTwo.print(VowelVSConsonant.isVowelCheckerV1(character));
    }
}
