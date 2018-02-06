package Task1;

public class CheckerDoesNumberIncrease {

    //4. Задача №4 - 4х-значная возрастаемость?
    public boolean numberIncreaseChecker(int numberToCheck) {
        int d4 = numberToCheck % 10;
        int d3 = (numberToCheck /= 10) % 10;
        int d2 = (numberToCheck /= 10) % 10;
        int d1 = (numberToCheck /= 10) % 10;

        return (d4 > d3 && d3 > d2 && d2 > d1);
    }
}
