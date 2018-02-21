package model;

public class MoodSensor {

    public static String moodSensor() {
        int moodScale = (int) (Math.random() * 5);
        switch (moodScale) {
            case 0:
                return("(×_×)");
            case 1:
                return("(╯︵╰,)");
            case 2:
                return("(￢_￢)");
            case 3:
                return("(─‿‿─)");
            case 4:
                return("(◕‿◕)");
            default:
                return("＼(￣▽￣)／");
        }
    }
}
