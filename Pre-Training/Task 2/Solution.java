import com.ibm.icu.text.RuleBasedNumberFormat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class Solution {

    private static int YOUNG_DRAGON_AGE = 200;
    private static int OLD_DRAGON_AGE = 300;
    private static int YOUNG_DRAGON_HEADS_GROW_RATE = 3;
    private static int ADULT_DRAGON_HEADS_GROW_RATE = 2;
    private static int FIRST_DAY_OF_MONTH;
    private static int FIRST_MONTH_OF_YEAR;
    private static int LAST_DAY_OF_MONTH;
    private static int LAST_MONTH_OF_YEAR;
    private static String[] TOSTRING1_9ENG = {"", "one", "two", "three", "four", "five", 
            "six", "seven", "eight", "nine"};
    private static String[] TOSTRING100ENG = {"", "one hundred", "two hundreds", "three hundreds", 
            "four hundreds", "five hundreds", "six hundreds", "seven hundreds", "eight hundreds", "nine hundreds"};
    private static String[] TOSTRING10_19ENG = {"ten", "eleven", "twelve", "thirteen", "fourteen", 
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TOSTRING20_90ENG = {"", "", "twenty", "thirty", "forty", "fifty", 
            "sixty", "seventy", "eighty", "ninety"};
    private static String[] TOSTRING1_9 = {"", "один", "два", "три", "четыре", "пять", 
            "шесть", "семь", "восемь", "девять"};
    private static String[] TOSTRING100 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", 
            "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static String[] TOSTRING10_19 = {"десять", "одиннадцать", "двенадцать", "тринадцать", 
            "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static String[] TOSTRING20_90 = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", 
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static char[] VOWELS = {'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'я', 'ы', 'ю'};
    private String vowelsString = new String(VOWELS);
    private static char[] CONSONANTS = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 
            'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    private String consonantsString = new String(CONSONANTS);


    public static void main(String[] args) {
        Solution s = new Solution();
        s.dragonAgeFinder(200);
        s.isVowelCheckerV1('а');
        s.isConsonantCheckerV1('в');
        s.isVowelCheckerV2('т');
        s.isConsonantCheckerV2('й');
        s.isVowelCheckerV3('а');
        s.isConsonantCheckerV3('в');
        s.isVowelCheckerV4('т');
        s.isConsonantCheckerV4('й');
        s.moodSensor();
        s.tomorrowFinder("18_12_31");
        s.digitToStringConverterRUS();
        s.digitToStringConverterENG();
        s.digitToStringConverterEasyRUS();
        s.digitToStringConverterEasyENG();
    }

    // 1. Дракон
    public int dragonAgeFinder(int dragonAge) {
        int heads = 3; // Dragon has 3 heads once born
        if (dragonAge < YOUNG_DRAGON_AGE)
            heads += dragonAge * YOUNG_DRAGON_HEADS_GROW_RATE; //First 200 years dragon grows 3 heads a year
        else if (dragonAge > YOUNG_DRAGON_AGE && dragonAge < OLD_DRAGON_AGE)
            heads += YOUNG_DRAGON_AGE + ADULT_DRAGON_HEADS_GROW_RATE * dragonAge; //Years 200 to 300 dragon grows 2 heads a year
        else heads += YOUNG_DRAGON_AGE * YOUNG_DRAGON_HEADS_GROW_RATE + //Dragons age above 300 years grow 1 head a year
                    ADULT_DRAGON_HEADS_GROW_RATE * (OLD_DRAGON_AGE - YOUNG_DRAGON_AGE) +
                    dragonAge - OLD_DRAGON_AGE;
        return heads;
    }

    // 2. Гласная? Версия 1.
    public boolean isVowelCheckerV1(char letterToCheck) {
        for (char c : VOWELS) {
            if (letterToCheck == c) {
                return true;
            }
        }
        return false;
    }

    // 2. Cогласная? Версия 1.
    public boolean isConsonantCheckerV1(char letterToCheck) {
        for (char c : CONSONANTS) {
            if (letterToCheck == c) {
                return true;
            }
        }
        return false;
    }

    // 2. Гласная? Версия 2.
    public boolean isVowelCheckerV2(char letterToCheck) {
        return (vowelsString.indexOf(letterToCheck) >= 0);
    }

    // 2. Cогласная? Версия 2.
    public boolean isConsonantCheckerV2(char letterToCheck) {
        return (consonantsString.indexOf(letterToCheck) >= 0);
    }

    // 2. Гласная? Версия 3.
    public boolean isVowelCheckerV3(char letterToCheck) {
        String letterString = "" + letterToCheck;
        return (vowelsString.contains(letterString));
    }

    // 2. Cогласная? Версия 3.
    public boolean isConsonantCheckerV3(char letterToCheck) {
        String letterString = "" + letterToCheck;
        return (consonantsString.contains(letterString));
    }

    // 5. Гласная или согласная. Версия 4.
    public boolean isVowelCheckerV4(char letterToCheck) {
        return (letterToCheck == 'а' || letterToCheck == 'е' || letterToCheck == 'ё' || letterToCheck == 'и' ||
                letterToCheck == 'о' || letterToCheck == 'у' || letterToCheck == 'э' || letterToCheck == 'я' ||
                letterToCheck == 'ы' || letterToCheck == 'ю');
    }

    // 2. Cогласная? Версия 4.
    public boolean isConsonantCheckerV4(char letterToCheck) {
        return (letterToCheck == 'б' || letterToCheck == 'в' || letterToCheck == 'г' || letterToCheck == 'д' ||
                letterToCheck == 'ж' || letterToCheck == 'з' || letterToCheck == 'й' || letterToCheck == 'к' ||
                letterToCheck == 'л' || letterToCheck == 'м' || letterToCheck == 'н' || letterToCheck == 'п' ||
                letterToCheck == 'р' || letterToCheck == 'с' || letterToCheck == 'т' || letterToCheck == 'ф' ||
                letterToCheck == 'х' || letterToCheck == 'ц' || letterToCheck == 'ч' || letterToCheck == 'ш' ||
                letterToCheck == 'щ');
    }

    // 6. Замеритель настроения.
    public void moodSensor() {
        int moodScale = (int) (Math.random() * 5);
        switch (moodScale) {
            case 0:
                System.out.println("(×_×)");
                break;
            case 1:
                System.out.println("(╯︵╰,)");
                break;
            case 2:
                System.out.println("(￢_￢)");
                break;
            case 3:
                System.out.println("(─‿‿─)");
                break;
            case 4:
                System.out.println("(◕‿◕)");
                break;
            case 5:
                System.out.println("＼(￣▽￣)／");
                break;
        }

    }

    // 7. Завтрашний день.
    public void tomorrowFinder(String todayDateFormatYY_MM_DD) {
        String[] parts = todayDateFormatYY_MM_DD.split("_");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (month == LAST_MONTH_OF_YEAR && day == LAST_DAY_OF_MONTH) { //End of year
            year++;
            day = FIRST_DAY_OF_MONTH;
            month = FIRST_MONTH_OF_YEAR;
        } else if (day == LAST_MONTH_OF_YEAR) { //End of 31-day month
            day = FIRST_DAY_OF_MONTH;
            month++;
        } else if (month == 4 || month == 6 || month == 9 || month == 11 && day == 30) { //months that have 30 days
            day = FIRST_DAY_OF_MONTH;
            month++;
        } else if (year % 400 == 0 && month == 2 && day == 28) { //February 28 days
            day = FIRST_DAY_OF_MONTH;
            month++;
        } else if (year % 4 == 0 && !(year % 100 == 0) && day == 29 && month == 2) { //February 29 days in a leap-year
            day = FIRST_DAY_OF_MONTH;
            month++;
        }
        System.out.println("Tomorrow is: year " + year + ", month " + month + ", day " + day);
    }

    // 8. Цифры в русские слова
    public void digitToStringConverterRUS() {
        System.out.print("*** Название числа в виде строки ***\nВведите число(\"Выход\", чтобы выйти): ");
        BufferedReader b1Reader = new BufferedReader(new InputStreamReader(System.in));
        String input;


        try {
            while (!((input = b1Reader.readLine()).equals("Выход"))) {
                int intDataInput = Integer.parseInt(input);
                int hundreds = intDataInput / 100;
                int tens = intDataInput / 10 % 10;
                int ones = intDataInput % 10;
                int below20 = intDataInput % 100; //Numbers 10-19 are spelled differently so we need to separate them
                if (below20 < 20 && below20 > 9) { //10-19 numbers separation
                    System.out.println("Число в виде строки: " + TOSTRING100[hundreds] + " "
                            + TOSTRING10_19[below20 - 10]);
                } else
                    System.out.println("Число в виде строки: " + TOSTRING100[hundreds] + " "
                            + TOSTRING20_90[tens] + " " + TOSTRING1_9[ones]);
                System.out.print("Введите число(\"Выход\", чтобы выйти): ");
            }
        } catch (Exception e) {
            System.out.println("А что вы вообще ввели? Я сваливаю отсюда");
        }

        System.out.println("Всего доброго!!");
    }

    // 9. Цифры в английские слова
    public void digitToStringConverterENG() {
        System.out.println("*** The name of the number as a string ***");
        System.out.print("Input number:(\"Exit\", to quit): ");
        BufferedReader b2Reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        try {
            while (!(input = b2Reader.readLine()).equals("Exit")) {
                int intDataInput = Integer.parseInt(input);
                int hundreds = intDataInput / 100;
                int tens = intDataInput / 10 % 10;
                int ones = intDataInput % 10;
                int below20 = intDataInput % 100;
                if (below20 < 20 && below20 > 9) {
                    System.out.println("The number as a string: " + TOSTRING100ENG[hundreds] + " "
                            + TOSTRING10_19ENG[below20 - 10]);
                } else
                    System.out.println("The number as a string: " + TOSTRING100ENG[hundreds] + " "
                            + TOSTRING20_90ENG[tens] + " " + TOSTRING1_9ENG[ones]);
                System.out.print("Input number:(\"Exit\", to quit): ");
            }
        } catch (Exception e) {
            System.out.println("What was that? Stop screwing me up! I'm out of here...");
        }
        System.out.println("See ya later!!");
    }

    // 10. Цифры в русские слова - упрощённая версия - http://site.icu-project.org/download/55#TOC-ICU4J-Download
    public void digitToStringConverterEasyRUS() {
        System.out.println("*** Название числа в виде строки ***");
        System.out.print("Введите число(\"Выход\", чтобы выйти): ");
        BufferedReader b3Reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            while (!(input = b3Reader.readLine()).equals("Выход")) {
                int intDataInput = Integer.parseInt(input);
                RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                        RuleBasedNumberFormat.SPELLOUT);
                System.out.println("Число в виде строки: " + nf.format(intDataInput));
                System.out.print("Введите число(\"Выход\", чтобы выйти): ");
            }

        } catch (Exception e) {
            System.out.println("А что вы вообще ввели? Я сваливаю отсюда");
        }
    }

    // 10. Цифры в английские слова - упрощённая версия - http://site.icu-project.org/download/55#TOC-ICU4J-Download
    public void digitToStringConverterEasyENG() {
        System.out.println("*** The name of the number as a string ***");
        System.out.print("Input number:(\"Exit\", to quit): ");
        BufferedReader b3Reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            while (!(input = b3Reader.readLine()).equals("Exit")) {
                int intDataInput = Integer.parseInt(input);
                RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"),
                        RuleBasedNumberFormat.SPELLOUT);
                System.out.println("The number as a string: " + nf.format(intDataInput));
                System.out.print("Input number:(\"Exit\", to quit): ");
            }

        } catch (Exception e) {
            System.out.println("What was that? Stop screwing me up! I'm out of here...");
        }
    }
}
