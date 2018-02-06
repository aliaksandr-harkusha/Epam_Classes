package Test3.model;

public class IsNumberPerfect {

    /*Натуральное число называют совершенным, если оно равно сумме всех своих
   делителей, не считая только его самого (например, 28=1+2+3+7+14 – совер-
   шенное число). Напишите программу, которая проверяет, является ли введён-
   ное натуральное число совершенным. Для проверки работоспособности про-
   граммы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.
   */
    public boolean isNumberPerfect(int numberToCheck) {
        int sum = 0;
        for (int i = 1; i < numberToCheck; i++) {
            if (numberToCheck % i == 0)
                sum += i;
        }
        return numberToCheck == sum;

    }
}
