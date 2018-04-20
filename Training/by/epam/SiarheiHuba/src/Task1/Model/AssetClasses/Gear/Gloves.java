package by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Gear;

public class Gloves extends MotorcycleGear {
    private String type = "Gloves";
    private String model;

    public Gloves(){
    }

    public Gloves(double price, double weight){
        super(price, weight);
    }
}
