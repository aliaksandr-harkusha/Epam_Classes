//правила именования пакетов:
//1. все буквы в названии должны быть маленькими
//2. src - не должно входить в название пакета
//3. правильное название должно быть типа - by.epam.task1.model или com.epam.task1.model
package by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Gear;

import by.epam.SiarheiHuba.src.Task1.View.View;

import java.util.Comparator;

public abstract class MotorcycleGear implements Comparable {
    protected double weight;
    protected String model = "no model name";
    protected double price;

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public MotorcycleGear() {
    }

    public MotorcycleGear(double price, double weight) {
        this.weight = weight;
        this.price = price;
    }

    public MotorcycleGear(String model, double price, double weight) {
        this.weight = weight;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return (String.format("%s: weight= %.2f, price= %.2f", getClass().getSimpleName(), weight, price));
    }

    public int compareTo(Object o) {
        MotorcycleGear gear = null;
        try {
            gear = (MotorcycleGear) o;
        } catch (ClassCastException e) {
            e.printStackTrace();
            View.view("Object is not a MororcycleGear type");
        }
        return Double.compare(this.getWeight(), gear.getWeight());
    }

    public int compareByPrice(Object o) {
        MotorcycleGear gear = null;
        try {
            gear = (MotorcycleGear) o;
        } catch (ClassCastException e) {
            e.printStackTrace();
            View.view("Object is not a MororcycleGear type");
        }
        return Double.compare(this.getWeight(), gear.getWeight());
    }
}
