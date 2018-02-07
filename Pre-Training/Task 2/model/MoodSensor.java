package model;

public class MoodSensor {

    public static void moodSensor() {
        int moodScale = (int) (Math.random() * 5);
        switch (moodScale) {
            case 0:
                System.out.println("(×_×)");
                break;
            case 1:
                System.out.println("(╯︵╰,)");
                break;
            case 2:
                System.out.println("(￢_￢)");
                break;
            case 3:
                System.out.println("(─‿‿─)");
                break;
            case 4:
                System.out.println("(◕‿◕)");
                break;
            case 5:
                System.out.println("＼(￣▽￣)／");
                break;
        }
    }
}
