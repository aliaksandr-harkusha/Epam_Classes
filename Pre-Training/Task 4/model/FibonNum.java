package model;

public class FibonNum {
    
    public static int calculateFibonNum(int num) {
        if (num <= 0)
            return -1;
        else if (num == 1)
            return 0;
        else return calculatorFibonNum(0, 1, num - 1);
    }

    public static int calculatorFibonNum(int n1, int n2, int n3) {
        if (n3 == 0) return n1;
        else return calculatorFibonNum(n2, n1 + n2, n3 - 1);
    }
}
