package controller;

public class DonutAreaCalculator {

    //2. Задача №2 - Площадь кольца
    public double calculatorDonutArea(double radius1, double radius2) {
        return Math.PI * (calculatorSquare(radius1) - calculatorSquare(radius2));
    }

    //method-helper for Task2
    public double calculatorSquare(double number) {
        return number * number;
    }
}
