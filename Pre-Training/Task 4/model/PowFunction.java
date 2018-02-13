public class PowFunction {

    public static void main(String[] args) {
        System.out.println(pow(0, 1));
    }

    public static double pow(double number, int number2) {
        if (number == 0) {
            System.out.println("0 - некорректное число, возвращаю 0 целых, 0 десятых");
            return 0;
        } else if (number2 == 0) return 1;
        return number * pow(number, number2 - 1);
    }
}
