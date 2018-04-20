package by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Gear;

public class Jacket extends MotorcycleGear{
    private String type = "Jacket";

    public Jacket(){
    }

    public Jacket(double price, double weight){
        super(price, weight);
    }
}
