package Task3;

public class ShowSimpleDividers {

    //найти все простые делители заданного натурального числа
    public void showSimpleDividers(int numberToCheck) {

        System.out.println("Простые делители числа:");
        for (int i = 1; i <= numberToCheck; i++)
            if (isNumberSimple(i) && (numberToCheck % i == 0))
                System.out.println(i);
    }
}
