package controller;

import model.Dragon;

public class TestTaskTwo {

    public static int YOUNG_DRAGON_AGE = 200;
    public static int OLD_DRAGON_AGE = 300;
    public static int YOUNG_DRAGON_HEADS_GROW_RATE = 3;
    public static int ADULT_DRAGON_HEADS_GROW_RATE = 2;
    public static int DRAGON_AGE = 350;

    public static void main(String[] args) {
        System.out.println("Dragon, which is " + DRAGON_AGE + " years old, has " +
                Dragon.dragonAgeFinder(DRAGON_AGE) + " heads and " + Dragon.dragonEyesCounter(DRAGON_AGE) + " eyes");
    }
}
