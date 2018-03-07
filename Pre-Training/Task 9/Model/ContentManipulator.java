package by.epam.preTraining.SiarheiHuba.tasks.Task9.Model;

public class ContentManipulator {

    // 1) Найти наибольшее количество предложений текста, в которых есть одинаковые слова.
    public int getMaxNumberOfSentencesWithSimilarWord(String content) {
        String s = content.replaceAll("...", ".");
        String[] sentences = s.split(".");
        return 0;
    }

    // 2) Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
    public String sortContentShortToLongSentences(String content) {
        String s = content.replace("...", ".");
        String[] sentences = s.split("\\. ");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
        }
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
// 4) Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.

    // 5) В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
    public String swithcSentenceFirstAndLastWord(String content) {
        String s = content.replace("...", ".");
        String[] sentences = s.split("\\. ");
        String result = "";
        String[] words;
        String temp;
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
        }
        for (int i = 0; i < sentences.length; i++) {
            words = sentences[i].split(" ");
            temp = words[0];
            int x = words.length - 1;
            words[0] = words[x];
            words[x] = temp;
            sentences[i] = "";
            for (String str : words) {
                sentences[i] = sentences[i] + str + " ";
            }
            sentences[i] = sentences[i].trim();
        }

        for (String str : sentences) {
            result = result + str + ". ";
        }
        return result;
    }

    // 6) Напечатать слова текста в алфавитном порядке по первой букве. Слова, начинающиеся с новой буквы, печатать с красной строки.
    public String sortAllWordsAlphabeticOrder(String str) {
        str = str.replace(".", "");
        String[] strArray = str.toLowerCase().split(" ");
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
// 8) Слова текста, начинающиеся с гласных букв, рассортировать в алфавитном порядке по первой согласной букве слова.
// 9) Все слова текста рассортировать по возрастанию количества заданной буквы в слове. Слова с одинаковым количеством расположить в алфавитном порядке.
// 10) Существует текст и список слов. Для каждого слова из заданного списка найти, сколько раз оно встречается в каждом предложении, и рассортировать слова по убыванию общего количества вхождений.
// 11) В каждом предложении текста исключить подстроку максимальной длины, начинающуюся и заканчивающуюся заданными символами.
// 12) Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
// 13) Отсортировать слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
// 14) В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом, т.е. читающуюся слева направо и справа налево одинаково.
// 15) Преобразовать каждое слово в тексте, удалив из него все последующие вхождения первой буквы этого слова.
// 16) Преобразовать каждое слово в тексте, удалив из него все предыдущие вхождения последней буквы этого слова.
// 17) В некотором предложении текста слова заданной длины заменить указанной подстрокой, длина которой может не совпадать с длиной слова.
}
