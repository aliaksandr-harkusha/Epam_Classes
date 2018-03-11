package by.epam.preTraining.SiarheiHuba.tasks.Task9.Model;

import by.epam.preTraining.SiarheiHuba.tasks.Task9.View.View;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class ContentManipulator {

    private static String PUNCT_LIST = "";
    private static char[] PUNCTUATION_SYMBOLS = {'!', '?', '-', ':', ',', '.'};
    private static int COUNTER = 0;

    // 1) Найти наибольшее количество предложений текста, в которых есть одинаковые слова.
    public int getMaxNumberOfSentencesWithSimilarWord(String content) {
        String[] sentences = breakContentToArrayOfSentences(content);
        int size = sentences.length, max = 0;
        COUNTER = 1;
        for (String eachSentence : sentences) {
            String[] wordsArray = eachSentence.split(" ");
            for (String singleWord : wordsArray) {
                for (int z = 1; z < size; z++) {
                    if (sentences[z].contains(singleWord))
                        COUNTER++;
                }
                if (COUNTER > max)
                    max = COUNTER;
                COUNTER = 1;
            }
        }
        return max;
    }

    // 2) Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
    public String sortContentShortToLongSentences(String content) {
        String[] sentences = breakContentToArrayOfSentences(content);
        String result = "";
        int x = sentences.length;
        for (int i = 1; i < x; i++) {
            for (int z = 1; z < x + 1 - i; z++) {
                if (sentences[z].split(" ").length < sentences[z - 1].split(" ").length) {
                    String temp = sentences[z];
                    sentences[z] = sentences[z - 1];
                    sentences[z - 1] = temp;
                }
            }
        }
        for (String str : sentences) {
            result = result + str + ". ";
        }
        return result;
    }


    // 3) Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
    public String findUniqueWordFromFirstSentence(String content) {
        String[] sentences = breakContentToArrayOfSentences(content);
        String[] firstSentence = sentences[0].split(" ");
        int sizeSentences = sentences.length;
        for (String wordToCheck : firstSentence) {
            for (int x = 1; x < sizeSentences; x++) {
                if (!sentences[x].contains(wordToCheck))
                    return wordToCheck;
            }
        }
        return "";
    }

    // 4) Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
    public void printWordsWithSpecificSizeFromInterrogativeSentences(int size, String content) {
        String[] sentences = breakContentToArrayOfSentences(content);
        View.view("Words with " + size + " letters in it from interrogative sentence:\n");
        for (String sent : sentences) {
            if (sent.contains("?")) {
                String[] interrogativeSentences = sent.split("\\?");
                for (int i = 0; i < interrogativeSentences.length - 1; i++) {
                    String[] finalTarget = interrogativeSentences[i].toLowerCase().split(" ");
                    for (String wordsToCheck : finalTarget) {
                        if (wordsToCheck.length() == size)
                            View.view(wordsToCheck + " ");
                    }
                }
            }
        }
        View.view("The End.");
    }

    // 5) В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
    public String swithcSentenceFirstAndLastWord(String content) {
        String[] sentences = breakContentToArrayOfSentences(content);
        String result = "", temp;
        String[] words;
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
            sentences[i] = sentences[i].substring(sentences[i].lastIndexOf(" "), sentences[i].length()) +
                    sentences[i].substring(sentences[i].indexOf(" "), sentences[i].lastIndexOf(" ")) + " " +
                    sentences[i].substring(0, sentences[i].indexOf(" "));
            result = result + sentences[i] + ". ";
        }
        return result;
    }

    // 6) Напечатать слова текста в алфавитном порядке по первой букве. Слова, начинающиеся с новой буквы, печатать с красной строки.
    public String sortAllWordsAlphabeticOrder(String str) {
        String[] strArray = breakContentToArrayOfWords(str);
        int size = strArray.length;
        String result = "";
        for (int i = 0; i < size; i++) {
            for (int z = 1; z < size - i; z++) {
                if (strArray[z].charAt(0) < strArray[z - 1].charAt(0)) {
                    String temp = strArray[z];
                    strArray[z] = strArray[z - 1];
                    strArray[z - 1] = temp;
                }
            }
        }
        for (int i = 0; i < size - 1; i++) {
            result = (strArray[i + 1].charAt(0) != strArray[i].charAt(0)) ? result + strArray[i] + "\n" : result + strArray[i] + " ";
        }
        return result;
    }

    // 7) Рассортировать слова текста по возрастанию доли гласных букв (отношение количества гласных к общему количеству букв в слове).
    public String sortBasedOnVowelPercentage(String str) {
        String[] strArray = breakContentToArrayOfWords(str);
        int size = strArray.length - 1;
        String result = "";
        for (int i = 1; i < size; i++) {
            for (int z = 1; z < size + 1 - i; z++)
                if (countVowels(strArray[z]) > countVowels(strArray[z + 1])) {
                    String tempString = strArray[z + 1];
                    strArray[z + 1] = strArray[z];
                    strArray[z] = tempString;
                }
        }
        return result;
    }

    // 8) Слова текста, начинающиеся с гласных букв, рассортировать в алфавитном порядке по первой согласной букве слова.
    public String sortWordsByFirstConsonant(String content) {
        String[] words = breakContentToArrayOfWords(content);
        int size = words.length;
        String newWords = "", temp, result = "";
        for (int i = 0; i < size; i++) {
            if (isVowel(words[i].charAt(0)))
                newWords = newWords + (words[i]) + " ";
        }
        String[] listToSort = newWords.trim().split(" ");
        int listSize = listToSort.length;
        for (int x = 0; x < listSize; x++) {
            for (int y = 1; y < listSize - x; y++) {
                if (getFirstConsonant(listToSort[y]) < getFirstConsonant(listToSort[y - 1])) {
                    temp = listToSort[y];
                    listToSort[y] = listToSort[y - 1];
                    listToSort[y - 1] = temp;
                }
            }
        }
        for (String str : listToSort) {
            result = result + str + " ";
        }
        return result;
    }

    // 9) Все слова текста рассортировать по возрастанию количества заданной буквы в слове.
    // Слова с одинаковым количеством расположить в алфавитном порядке.
    public String sortWordsBasedOnOneLetterQuantity(String content, char Letter) {
        String[] words = breakContentToArrayOfWords(content);
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>();
        ArrayList<String> list;
        String result = "";
        int counter = 0;
        for (String word : words) {
            counter = counter + StringUtils.countMatches(word, Letter);
            if (map.containsKey(counter))
                list = map.get(counter);
            else
                list = new ArrayList<String>();
            list.add(word);
            Collections.sort(list);
            map.put(counter, list);
            counter = 0;
        }
        for (Integer occurencyRate : map.keySet()) {
            for (String st : map.get(occurencyRate)) {
                result = result + st + " ";
            }
        }
        return result.trim();
    }

    // 10) Существует текст и список слов. Для каждого слова из заданного списка найти,
// сколько раз оно встречается в каждом предложении, и рассортировать слова по убыванию общего количества вхождений.
    public String sortSentencesByWordsRepetition(String content, String[] words) {
        int counter = 0;
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>(Collections.reverseOrder());
        ArrayList<String> list;
        String result = "";
        for (String word : words) {
            counter = counter + StringUtils.countMatches(content, word);
            if (map.containsKey(counter))
                list = map.get(counter);
            else
                list = new ArrayList<String>();
            list.add(word);
            map.put(counter, list);
            counter = 0;
        }
        for (Integer occurencyRate : map.keySet()) {
            for (String st : map.get(occurencyRate)) {
                result = result + st + " ";
            }
        }
        return result.trim();
    }

    // 11) В каждом предложении текста исключить подстроку максимальной длины, начинающуюся и заканчивающуюся заданными символами.
    public String removeLongestSubstring(String content, char firstCharacter, char lastCharacter) {
        String[] sentences = breakContentToArrayOfSentences(content);
        pushPuntuationSimbolsToDB(content);
        String result = "";
        for (int i = 0; i < sentences.length; i++) {
            try {
                sentences[i] = sentences[i].replaceAll(sentences[i].substring
                        (sentences[i].indexOf(firstCharacter), sentences[i].lastIndexOf(lastCharacter)), "");
            } catch (IndexOutOfBoundsException e) {
            }
        }
        for (String sentence : sentences) {
            result = result + sentence + ". ";
        }
        return returnPunctuationSymbols(result.substring(0, result.length() - 2));
    }


    // 12) Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
    public String removeWordsThatStartsWithConstLetterAndFixedSize(String content, int wordSize) {
        String[] sentences = breakContentToArrayOfSentences(content);
        String finalWords = "";
        pushPuntuationSimbolsToDB(content);
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (countLettersInWord(words[i]) == wordSize && !isVowel(words[i].charAt(0))) {
                    words[i] = "";
                }
            }
            for (String word : words) {
                finalWords = finalWords + word + " ";
            }
            finalWords = finalWords.trim() + ".";
        }
        return returnPunctuationSymbols(trimExtraSpaces(finalWords));
    }

    // 13) Отсортировать слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
    public String sortAllWordsBasedOnSymbolOccurencyRate(String content, String symbol) {
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>(Collections.reverseOrder());
        ArrayList<String> strList;
        int count = 0;
        String words[] = breakContentToArrayOfWords(content);
        int size = words.length;
        for (int i = 0; i < size; i++) {
            count = StringUtils.countMatches(words[i], symbol);
            if (map.containsKey(count)) {
                strList = map.get(count);
            } else strList = new ArrayList<String>();
            strList.add(words[i]);
            Collections.sort(strList);
            map.put(count, strList);
        }
        String result = "";
        for (Integer key : map.keySet()) {
            ArrayList<String> sList = map.get(key);
            for (String st : sList) {
                result = result + st + " ";
            }
        }
        return result.trim();
    }

    // 14) В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом,
// т.е. читающуюся слева направо и справа налево одинаково.
    public String getLongestPolindrome(String content) {
        int size = content.length();
        String poly = "";
        for (int i = 1; i < size; i++) {
            int k = 0, maxSize = 0;
            while (i - 1 - k >= 0 && i + 1 + k < size && isPalindrome(content.substring(i - 1 - k, i + 1 + k))) {
                if (k * 2 > maxSize) {
                    maxSize = k * 2;
                    poly = content.substring(i - 1 - k, i + 1 + k);
                }
                k++;
            }
            k = 0;
            while (i - 1 - k >= 0 && i + 2 + k < size && isPalindrome(content.substring(i - 1 - k, i + 2 + k))) {
                if (k * 2 > maxSize) {
                    maxSize = k * 2;
                    poly = content.substring(i - 1 - k, i + 2 + k);
                }
                k++;
            }

        }
        return poly;
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2 + s.length() % 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }


    // 15) Преобразовать каждое слово в тексте, удалив из него все последующие вхождения первой буквы этого слова.
    public String removeAllLettersSameAsFirstLetterOfAWord(String content) {
        String[] words = content.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].charAt(0) + words[i].replaceAll(String.valueOf(words[i].charAt(0)), "");
        }
        for (String word : words) {
            result = result + word + " ";
        }
        return result.trim();
    }

    // 16) Преобразовать каждое слово в тексте, удалив из него все предыдущие вхождения последней буквы этого слова.
    public String removeAllLettersSameAsLastLetterOfAWord(String content) {
        String[] words = content.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, words[i].lastIndexOf(getLastLetter(words[i]))).
                    replaceAll(String.valueOf(getLastLetter(words[i])), "") +
                    words[i].substring(words[i].lastIndexOf(getLastLetter(words[i])), words[i].length());
        }
        for (String word : words) {
            result = result + word + " ";
        }
        return result.trim();
    }

    private static String getLastLetter(String word) {
        int size = word.length() - 1;
        for (int i = size; i >= 0; i--) {
            if (Character.isLetter(word.charAt(i)))
                return String.valueOf(word.charAt(i));
            else getLastLetter(word.substring(0, word.length() - 1));
        }
        return "";
    }

    // 17) В некотором предложении текста слова заданной длины заменить указанной подстрокой,
// длина которой может не совпадать с длиной слова.
    public String replaceEachWordWithSpecificLengthInSpecificSentenceWithNewWord
    (String content, String newWord, int sentenceNumber, int wordsLength) {
        pushPuntuationSimbolsToDB(content);
        String finalWords = "", finalWordsOneSentence = "";
        String[] sentences = breakContentToArrayOfSentences(content);
        for (int i = 0; i < sentences.length; i++) {
            if ((i + 1) == sentenceNumber) {
                String[] words = breakContentToArrayOfWords(sentences[i]);
                for (int x = 0; x < words.length; x++) {
                    if (words[x].length() == wordsLength)
                        words[x] = newWord;
                }
                for (String word : words) {
                    finalWordsOneSentence = finalWordsOneSentence + " " + word;
                }
                sentences[i] = finalWordsOneSentence.trim();
            }
            finalWords = finalWords + ".";
        }
        return returnPunctuationSymbols(finalWords);
    }


    //Helpers


    // Breaks a string to array of strings removing dots and spaces.
    private static String[] breakContentToArrayOfWords(String str) {
        return str.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
    }

    // Breaks a string to array of sentences
    private String[] breakContentToArrayOfSentences(String str) {
        pushPuntuationSimbolsToDB(str);
        String[] strArray = str.toLowerCase().split("[\\.!\\?+]+");
        for (String x : strArray) {
            x = x.trim();
        }
        return strArray;
    }

    private static String returnPunctuationSymbols(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                result = result + pullPunctuationSimbols();
            } else
                result = result + str.charAt(i);
        }
        return result;
    }

    private static void pushPuntuationSimbolsToDB(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (char punct : PUNCTUATION_SYMBOLS) {
                if (str.charAt(i) == punct) {
                    PUNCT_LIST = PUNCT_LIST + str.charAt(i);
                }
            }
        }
    }

    private static boolean chechTwoWordsIfSortedAlphabetically(String word1, String word2) {
        if (word1.length() > 0 && word2.length() > 0) {
            if (word2.charAt(0) > word1.charAt(0)) {
                return true;
            } else if (word2.charAt(0) < word1.charAt(0))
                return false;
            else return (chechTwoWordsIfSortedAlphabetically
                        (word1.substring(1, word1.length()), word2.substring(1, word2.length())));
        }
        return false;
    }

    private static char pullPunctuationSimbols() {
        char x = PUNCT_LIST.charAt(0);
        PUNCT_LIST = PUNCT_LIST.substring(1, PUNCT_LIST.length());
        return x;
    }

    private static int countLettersInWord(String word) {
        return word.length();
    }

    //Counts vowels in a string
    private static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char charToCheck) {
        return ("aeiou".indexOf(charToCheck) >= 0);
    }

    private static String trimExtraSpaces(String str) {
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        return str;
    }


    private char getFirstConsonant(String word) {
        if (!isVowel(word.charAt(0)))
            return word.charAt(0);
        else if (word.length() == 1) return '0';
        else return getFirstConsonant(word.substring(1, word.length()));
    }

    private static String combineSentencesBack(String[] sentences) {
        String result = "";
        for (String str : sentences) {
            result = result + str + ". ";
        }
        return returnPunctuationSymbols(result);
    }
}
