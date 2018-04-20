package by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Gear;

public class Pants extends MotorcycleGear{
    private String type = "Pants";

    public Pants(){
    }

    public Pants(double price, double weight){
        super(price, weight);
    }
}
