public class FibonNum {

    public static void main(String[] args) {
        System.out.println(fibonNum(0, 1, 7));
    }

    public static int fibonNum(int n1, int n2, int num) {
        if (num <= 0)
            return -1;
        else if (num == 1)
            return n1;
        else return fibonNum(n2, n1 + n2, num - 1);
    }
}
