package Task3;

public class MaxDigitOfANumber {

    //найти наибольшую цифру натурального числа
    public int getMaxDigitOfANumber(int numberToCheck) {

        int maxNumber = 0;
        int digit;
        while (numberToCheck > 0) {
            digit = numberToCheck % 10;
            if (digit > maxNumber)
                maxNumber = digit;
            numberToCheck /= 10;
        }
        return maxNumber;
    }
}
