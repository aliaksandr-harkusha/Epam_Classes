package Task1.Model.AssetClasses.Gear;

public class Helmet extends MotorcycleGear {
    private String type = "Helmet";

    public Helmet() {
    }

    public Helmet(double price, double weight) {
        super(price, weight);
    }
}
