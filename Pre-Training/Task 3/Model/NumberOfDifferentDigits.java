package Test3;

public class NumberOfDifferentDigits {

    //найти количество различных цифр у заданного натурального числа.
    public int numberOfDifferentDigits(int numberToCheck) {

        String stringNumberToCheck = Integer.toString(numberToCheck), uniqueNumbersStr = "";
        for (int i = 0; i < stringNumberToCheck.length(); i++) {
            if (uniqueNumbersStr.indexOf(stringNumberToCheck.charAt(i)) == -1) {
                uniqueNumbersStr += stringNumberToCheck.charAt(i);
            }
        }
        return uniqueNumbersStr.length();
    }
}
