package Task1.Model.AssetClasses.Gear;

import Task1.View.View;

public class MotorcycleGear implements Comparable {
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
}
