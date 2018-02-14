package model;

public class ShowSimpleDividers {

    //найти все простые делители заданного натурального числа
    public static void calculateSimpleDividers(int numberToCheck) {

        int half = numberToCheck/2;
        System.out.print("Simple dividers: ");
        for (int i = 1; i <= half; i++)
            if (IsNumberSimple.checkIfNumberSimple(i) && (numberToCheck % i == 0))
                System.out.print(i + " ");
    }
}
