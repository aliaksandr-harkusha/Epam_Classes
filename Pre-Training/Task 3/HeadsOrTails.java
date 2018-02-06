package Task3;

/*
Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), кото-
рая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
сколько раз выпал орёл, а сколько – решка.
 */

public class HeadsOrTails {

    public void coinFlipper() {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 1000; i++) {
            if (willMaker())
                heads++;
            else tails++;
        }
        System.out.println("Решка - " + tails + "\nОрёл - " + heads);
    }


    public boolean willMaker() {
        double x = Math.random();
        return (x > 0.5);
    }
}
