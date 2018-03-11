package by.epam.preTraining.SiarheiHuba.tasks.Task9.Controller;

import by.epam.preTraining.SiarheiHuba.tasks.Task9.Model.ContentManipulator;
import by.epam.preTraining.SiarheiHuba.tasks.Task9.View.View;

public class Controller {

    public static void main(String[] args) {
        String testString = "Sentence 1number one has six wordwws. Sentence 2number five two has seves noon seven words. " +
                "Sentence 3number three one hasa? Sentence 4number four has eight Sentence different nice words. One Sentence ox";
        String[] words = new String[]{"five", "one", "has"};

        Controller runner = new Controller();
        //System.out.println((runner.task1Method(testString)));
        //System.out.println((runner.task2Method(testString)));
        //System.out.println((runner.task3Method(testString)));
        //runner.task4Method(5, testString);
        System.out.println((runner.task5Method(testString)));
    }

    ContentManipulator manipulator = new ContentManipulator();

    public int task1Method(String content) {
        return manipulator.getMaxNumberOfSentencesWithSimilarWord(content);
    }

    public String task2Method(String content) {
        return manipulator.sortContentShortToLongSentences(content);
    }

    public String task3Method(String content) {
        return manipulator.findUniqueWordFromFirstSentence(content);
    }

    public void task4Method(int size, String content) {
        manipulator.printWordsWithSpecificSizeFromInterrogativeSentences(size, content);
    }

    public String task5Method(String content) {
        return manipulator.swithcSentenceFirstAndLastWord(content);
    }

    public String task6Method(String content) {
        return manipulator.sortAllWordsAlphabeticOrder(content);
    }

    public String task7Method(String content) {
        return manipulator.sortBasedOnVowelPercentage(content);
    }

    public String task8Method(String content) {
        return manipulator.sortWordsByFirstConsonant(content);
    }

    public String task9Method(String content, char ch) {
        return manipulator.sortWordsBasedOnOneLetterQuantity(content, ch);
    }

    public String task10Method(String content, String[] words) {
        return manipulator.sortSentencesByWordsRepetition(content, words);
    }

    public String task11Method(String content, char firstCharacter, char lastCharacter) {
        return manipulator.removeLongestSubstring(content, firstCharacter, lastCharacter);
    }

    public String task12Method(String content, int wordSize) {
        return manipulator.removeWordsThatStartsWithConstLetterAndFixedSize(content, wordSize);
    }

    public String task13Method(String content, String symbol) {
        return manipulator.sortAllWordsBasedOnSymbolOccurencyRate(content, symbol);
    }

    public String task14Method(String content) {
        return manipulator.getLongestPolindrome(content);
    }

    public String task15Method(String content) {
        return manipulator.removeAllLettersSameAsFirstLetterOfAWord(content);
    }

    public String task16Method(String content) {
        return manipulator.removeAllLettersSameAsLastLetterOfAWord(content);
    }

    public String task17Method(String content, String newWord, int sentenceNumber, int wordsLength) {
        return manipulator.replaceEachWordWithSpecificLengthInSpecificSentenceWithNewWord
                (content, newWord, sentenceNumber, wordsLength);
    }

}
