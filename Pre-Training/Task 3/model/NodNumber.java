package model;

import java.math.BigInteger;

    public class NodNumber {

    //найти НОД двух натуральных чисел a и b.
    public static int calculateNodNumber(int numberOne, int numberTwo) {
        BigInteger b1 = BigInteger.valueOf(numberOne);
        BigInteger b2 = BigInteger.valueOf(numberTwo);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
