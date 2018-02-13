public class NumberDigitEqualsSum {

    public static void main(String[] args) {
        System.out.println(equals(1, 28));
    }

    public static boolean equals(int number, int sum) {
        if (number < 0 || sum < 0) {
            System.out.println("Запрещено вводить отрицательные числа");
            return false;
        } else return (sum == sumRecurs(number));
    }

    public static int sumRecurs(int number) {
        if (number < 10) {
            return number;
        } else
            return number % 10 + sumRecurs(number / 10);
    }
}
