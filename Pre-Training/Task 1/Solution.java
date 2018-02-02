public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.dinoMass(10002.2); // 1. Динозавр
        s.donutArea(23, 15); //2. Площадь кольца
        s.intSwitcher(15, 99); //3. Переброс переменных
        s.numberChecker(1357); //4. 4х-значная возрастаемость/убываемость
        s.sumAndMulti5DigitNumber(11112); //5. Сумма и произведение пятизначного числа
        s.ariGeoNumber(183462); //6. Арифметическое и геометрическое среднее число 6тизначного числа
        s.reverse7DigitsNumber(1928374); //7. Реверз 7ми значного числа

    }

    // 1. Динозавр
    public void dinoMass(double grams) {
        System.out.println("Задача №1 - Динозавр");
        System.out.println("Масса динозавра:\n В граммах: " + grams + "гр.\n В килограммах: " + grams / 1000 + "кг\n В тоннах: " + grams / 1000000 + "тн\n");
    }

    //2. Площадь кольца
    public void donutArea(double radius1, double radius2) {
        double result = Math.PI * (radius1 * radius1 - radius2 * radius2);
        System.out.println("Задача №2 - Площадь кольца");
        System.out.println("Площадь кольца - " + result + "\n");
    }

    //3. Переброс переменных
    public void intSwitcher(int a, int b) {
        System.out.println("Задача №3 - Переброс переменных " + a + " и " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новая переменная a = " + a + ", новая переменная b = " + b + "\n");
    }

    //4. 4х-значная возрастаемость/убываемость
    public void numberChecker(int numberToCheck) {
        int d1 = numberToCheck%10;
        int d2 = numberToCheck%100/10;
        int d3 = numberToCheck/100%10;
        int d4 = numberToCheck/1000;
        System.out.println("Задача №4 - 4х-значная возрастаемость/убываемость");
        if (d4 < d3 && d3 < d2 && d2 < d1)
            System.out.println("Переменная " + numberToCheck + " - возрастающая\n");
        else System.out.println("Переменная " + numberToCheck + " - не возрастающая\n");
    }

    //5. Сумма и произведение пятизначного числа
    public void sumAndMulti5DigitNumber(int number5Digits) {


        int d1 = number5Digits%10;
        int d2 = number5Digits%100/10;
        int d3 = number5Digits%1000/100;
        int d4 = number5Digits/1000%10;
        int d5 = number5Digits/10000;
        int sum = d1+d2+d3+d4+d5, multi = d1*d2*d3*d4*d5;
        System.out.println("Задача №5 - Сумма и произведение пятизначного числа");
        System.out.println("Сумма цифр числа " + number5Digits + " = " + sum + ", произведение цифр = " + multi + "\n");
    }

    //6. Арифметическое и геометрическое среднее число 6тизначного числа
    public void ariGeoNumber(int number6Digits) {

        int d6 = number6Digits%10;
        int d5 = (number6Digits/=10) %10;
        int d4 = (number6Digits/=10) %10;
        int d3 = (number6Digits/=10) %10;
        int d2 = (number6Digits/=10) %10;
        int d1 = (number6Digits/=10) %10;
        int sum = d1+d2+d3+d4+d5+d6;
        double geoSum = Math.log(d1)+Math.log(d2)+Math.log(d3)+Math.log(d4)+Math.log(d5)+Math.log(d6);
        int aveAri = sum / 6;
        double aveGeo = Math.exp(geoSum / 6);
        System.out.println("Задача №6 - Арифметическое и геометрическое среднее число 6тизначного числа");
        System.out.println("Арифметическое среднее числа " + number6Digits + " = " + aveAri + ", геометрическое среднее = " + aveGeo + "\n");
    }

    //7. Реверз 7ми значного числа
    public void reverse7DigitsNumber(int number7Digits) {
        String intToReverse = Integer.toString(number7Digits);
        StringBuilder reverser = new StringBuilder(intToReverse).reverse();
        int result = Integer.parseInt(reverser.toString());
        System.out.println("Задача №7 - Реверз 7ми значного числа");
        System.out.print("Реверз 7ми значного числа " + number7Digits + " это - " + result);

    }
}
