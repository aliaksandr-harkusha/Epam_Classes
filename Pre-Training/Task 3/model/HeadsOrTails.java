package model;

/*
Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), кото-
рая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
сколько раз выпал орёл, а сколько – решка.
 */

import java.util.Random;

public class HeadsOrTails {

    public static int countHeadsCoinFlipper(int timesToFlip) {
        int heads = 0;
        Random rand = new Random();
        for (int i = 0; i < timesToFlip; i++) {
            if (rand.nextBoolean())
                heads++;
        }
        return heads;
    }


}
