package model;

public class VowelVSConsonant {

    private static char[] VOWELS = {'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'я', 'ы', 'ю'};
    private String vowelsString = new String(VOWELS);
    private static char[] CONSONANTS = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р',
            'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    private String consonantsString = new String(CONSONANTS);

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
}
