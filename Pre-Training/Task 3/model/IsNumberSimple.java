package model;

public class IsNumberSimple {

    //определить является ли заданное натуральное число простым
    public static boolean checkIfNumberSimple(int numberToCheck) {
        int counter = 0;
        int half = numberToCheck/2;
        for (int i = 1; i <= half; i++) {
            if (numberToCheck % i == 0)
                counter++;
        }
        return (counter == 1);
    }
}
