package model;

/*
Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), кото-
рая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
сколько раз выпал орёл, а сколько – решка.
 */

public class HeadsOrTails {

    public static void coinFlipper() {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 1000; i++) {
            if (willMaker())
                heads++;
            else tails++;
        }
        System.out.println("Tails - " + tails + "\nHeads - " + heads);
    }


    public static boolean willMaker() {
        double x = Math.random();
        return (x > 0.5);
    }
}
