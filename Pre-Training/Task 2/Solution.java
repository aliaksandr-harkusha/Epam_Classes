import com.ibm.icu.text.RuleBasedNumberFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class Solution {

    private char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'я', 'ы', 'ю'};
    private String vowelsString = new String(vowels);
    private char[] consonants = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    private String consonantsString = new String(consonants);

    public static void main(String[] args) {
        Solution s = new Solution();
        s.dragonAgeFinder(200);
        s.vowelOrConsonantCheckerV1('а');
        s.vowelOrConsonantCheckerV2('в');
        s.vowelOrConsonantCheckerV3('т');
        s.vowelOrConsonantCheckerV4('й');
        s.moodSensor();
        s.tomorrowFinder("18_12_31");
        s.digitToStringConverterRUS();
        s.digitToStringConverterENG();
        s.digitToStringConverterEasyRUS();
        s.digitToStringConverterEasyENG();
    }

    // 1. Дракон
    public void dragonAgeFinder(int age) {
        int heads;
        if (age < 200)
            heads = (age + 1) * 3;
        else if (age > 200 && age < 300)
            heads = 603 + 2*(age-200);
        else heads = 803 + age - 300;

        System.out.println("У дракона в " + age + " лет: Кол-во голов - " + heads + ", кол-во глаз - " + heads * 2);
    }

    // 2. Гласная или согласная. Версия 1.
    public void vowelOrConsonantCheckerV1(char letterToCheck) {
        boolean result = false;
        for (char c : vowels) {
            if (letterToCheck == c) {
                System.out.println(letterToCheck + " - гласная");
                result = true;
            }
        }
        for (char c : consonants) {
            if (letterToCheck == c) {
                System.out.println(letterToCheck + " - согласная");
                result = true;
            }
        }
        if (!result) System.out.println("А что вы вообще ввели?");
    }

    // 3. Гласная или согласная. Версия 2.
    public void vowelOrConsonantCheckerV2(char letterToCheck) {
        if (vowelsString.indexOf(letterToCheck) >= 0) System.out.println(letterToCheck + " - гласная");
        else if (consonantsString.indexOf(letterToCheck) >= 0) System.out.println(letterToCheck + " - согласная");
        else System.out.println("А что вы вообще ввели?");
    }


    // 4. Гласная или согласная. Версия 3.
    public void vowelOrConsonantCheckerV3(char letterToCheck) {
        String letterString = "" + letterToCheck;
        if (vowelsString.contains(letterString)) System.out.println(letterToCheck + " - гласная");
        else if (consonantsString.contains(letterString)) System.out.println(letterToCheck + " - согласная");
        else System.out.println("А что вы вообще ввели?");
    }


    // 5. Гласная или согласная. Версия 4.
    public void vowelOrConsonantCheckerV4(char letterToCheck) {
        if (letterToCheck == 'а' || letterToCheck == 'е' || letterToCheck == 'ё' || letterToCheck == 'и' || letterToCheck == 'о' || letterToCheck == 'у' || letterToCheck == 'э' || letterToCheck == 'я' ||
                letterToCheck == 'ы' || letterToCheck == 'ю')
            System.out.println(letterToCheck + " - гласная");
        else if (letterToCheck == 'б' || letterToCheck == 'в' || letterToCheck == 'г' || letterToCheck == 'д' || letterToCheck == 'ж' || letterToCheck == 'з' || letterToCheck == 'й' || letterToCheck == 'к' ||
                letterToCheck == 'л' || letterToCheck == 'м' || letterToCheck == 'н' || letterToCheck == 'п' || letterToCheck == 'р' || letterToCheck == 'с' || letterToCheck == 'т' || letterToCheck == 'ф' ||
                letterToCheck == 'х' || letterToCheck == 'ц' || letterToCheck == 'ч' || letterToCheck == 'ш' || letterToCheck == 'щ')
            System.out.println(letterToCheck + " - согласная");
        else System.out.println("А что вы вообще ввели?");
    }


    // 6. Замеритель настроения.
    public void moodSensor() {
        int moodScale = (int) (Math.random() * 5);
        switch (moodScale) {
            case 0:
                System.out.println("(×_×)");
                break;
            case 1:
                System.out.println("╯︵╰,)");
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

        if (month == 12 && day == 31) {
            year++;
            day = 1;
            month = 1;
        } else if (day == 31) {
            day = 1;
            month++;
        } else if (year % 400 == 0 && month == 2 && day == 28) {
            day = 1;
            month++;
        } else if (year % 4 == 0 && !(year % 100 == 0) && day == 28 && month == 2) {
            day = 1;
            month++;
        } else if (month == 4 || month == 6 || month == 9 || month == 11 && day == 30) {
            day = 1;
            month++;
        }
        System.out.println("Tomorrow is: year " + year + ", month " + month + ", day " + day);
    }

    // 8. Цифры в русские слова
    public void digitToStringConverterRUS() {
        System.out.print("*** Название числа в виде строки ***\nВведите число(\"Выход\", чтобы выйти): ");
        BufferedReader b1Reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        String[] str1_9 = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] str100 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] str10_19 = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] str20_90 = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};

        try {
            while (!((input = b1Reader.readLine()).equals("Выход"))) {
                int intDataInput = Integer.parseInt(input);
                int hundreds = intDataInput / 100;
                int tens = intDataInput / 10 % 10;
                int ones = intDataInput % 10;
                int below20 = intDataInput % 100;
                if (below20 < 20 && below20 > 9) {
                    System.out.println("Число в виде строки: " + str100[hundreds] + " " + str10_19[below20 - 10]);
                } else
                    System.out.println("Число в виде строки: " + str100[hundreds] + " " + str20_90[tens] + " " + str1_9[ones]);
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

        String[] str1_9 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] str100 = {"", "one hundred", "two hundreds", "three hundreds", "four hundreds", "five hundreds", "six hundreds", "seven hundreds", "eight hundreds", "nine hundreds"};
        String[] str10_19 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] str20_90 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        try {
            while (!(input = b2Reader.readLine()).equals("Exit")) {
                int intDataInput = Integer.parseInt(input);
                int hundreds = intDataInput / 100;
                int tens = intDataInput / 10 % 10;
                int ones = intDataInput % 10;
                int below20 = intDataInput % 100;
                if (below20 < 20 && below20 > 9) {
                    System.out.println("The number as a string: " + str100[hundreds] + " " + str10_19[below20 - 10]);
                } else
                    System.out.println("The number as a string: " + str100[hundreds] + " " + str20_90[tens] + " " + str1_9[ones]);
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
