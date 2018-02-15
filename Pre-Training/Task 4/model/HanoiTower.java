public class HanoiTower {

    public static void main(String[] args) {
        moveMaker(4, "A", "B", "C");
    }

    public static void moveMaker(int height, String poleOne, String poleTwo, String poleThree) {
        if (height >= 1) {
            moveMaker(height - 1, poleOne, poleThree, poleTwo);
            movePrinter(poleOne, poleTwo);
            moveMaker(height - 1, poleThree, poleTwo, poleOne);
        }
    }

    public static void movePrinter(String poleOne, String poleTwo) {
        System.out.println(poleOne + "-->" + poleTwo);
    }
}
