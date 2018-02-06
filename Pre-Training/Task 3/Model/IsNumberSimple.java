package Task3;

public class IsNumberSimple {

    //определить является ли заданное натуральное число простым
    public boolean isNumberSimple(int numberToCheck) {
        int counter = 0;
        for (int i = 1; i <= numberToCheck; i++) {
            if (numberToCheck % i == 0)
                counter++;
        }
        return (counter == 2);
    }
}
