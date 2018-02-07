public class NumbersSwitcher {

    //3. Задача №3 - Переброс переменных
    public void intSwitcher(int a, int b) {
        System.out.println("Задача №3 - Переброс переменных " + a + " и " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Новая переменная a = " + a + ", новая переменная b = " + b + "\n");
    }
}
