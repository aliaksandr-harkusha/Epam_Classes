package model;

public class HanoiTower {

    public static void moveMaker(int height, String poleOne, String poleTwo, String poleThree) {
        if (height >= 1) {
            moveMaker(height - 1, poleOne, poleThree, poleTwo);
            View.print(poleOne + "-->" + poleTwo);
            moveMaker(height - 1, poleThree, poleTwo, poleOne);
        }
    }
}
