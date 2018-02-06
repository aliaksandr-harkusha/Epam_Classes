package Task 2;

public class Dragon {

    private static int YOUNG_DRAGON_AGE = 200;
    private static int OLD_DRAGON_AGE = 300;
    private static int YOUNG_DRAGON_HEADS_GROW_RATE = 3;
    private static int ADULT_DRAGON_HEADS_GROW_RATE = 2;

    public int dragonAgeFinder(int dragonAge) {
        int heads = 3; // Dragon has 3 heads once born
        if (dragonAge < YOUNG_DRAGON_AGE)
            heads += dragonAge * YOUNG_DRAGON_HEADS_GROW_RATE; //First 200 years dragon grows 3 heads a year
        else if (dragonAge > YOUNG_DRAGON_AGE && dragonAge < OLD_DRAGON_AGE)
            heads += YOUNG_DRAGON_AGE + ADULT_DRAGON_HEADS_GROW_RATE * dragonAge; //Years 200 to 300 dragon grows 2 heads a year
        else heads += YOUNG_DRAGON_AGE * YOUNG_DRAGON_HEADS_GROW_RATE + //Dragons age above 300 years grow 1 head a year
                    ADULT_DRAGON_HEADS_GROW_RATE * (OLD_DRAGON_AGE - YOUNG_DRAGON_AGE) +
                    dragonAge - OLD_DRAGON_AGE;
        return heads;
    }

    public int dragonEyesCounter(int dragonAge) {
        return dragonAgeFinder(dragonAge) * 2;
    }
}
