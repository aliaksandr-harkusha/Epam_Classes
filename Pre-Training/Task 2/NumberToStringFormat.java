package Task2;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class NumberToStringFormat {

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
