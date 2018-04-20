package Task1.Model.AssetClasses.Gear;

public class Boots extends MotorcycleGear {
    private String type = "Boots";
    private String model = "no name Model";

    public Boots() {
    }

    public Boots(double price, double weight) {
        super(price, weight);
    }
}
