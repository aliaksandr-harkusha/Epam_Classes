package model;

public class ShowSimpleDividers {

    //найти все простые делители заданного натурального числа
    public static void showSimpleDividers(int numberToCheck) {

        System.out.print("Simple dividers: ");
        for (int i = 1; i <= numberToCheck; i++)
            if (IsNumberSimple.isNumberSimple(i) && (numberToCheck % i == 0))
                System.out.print(i + " ");
    }
}
