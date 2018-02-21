package model;

public class HanoiTower {

    static String RESULT = "";

    public static String solveHanoiTower(int height, String poleOne, String poleTwo, String poleThree) {
        if (height >= 1) {
            solveHanoiTower(height - 1, poleOne, poleThree, poleTwo);
            RESULT += poleOne + "-->" + poleTwo + "\n";
            solveHanoiTower(height - 1, poleThree, poleTwo, poleOne);
        }
        return RESULT;
    }
}
