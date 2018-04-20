package Task1.Model.ActionClasses;

import Task1.Model.AssetClasses.Biker;
import Task1.Model.AssetClasses.Gear.MotorcycleGear;

public class Calculator {
    private static MotorcycleGear mg;
    public static double getBikerGearCost(Biker biker){
        return biker.getBoots().getPrice() + biker.getGloves().getPrice() +
                biker.getHelmet().getPrice() + biker.getJacket().getPrice() +
                biker.getPants().getPrice();
    }

    public static double getBikerGearWeight(Biker biker){
        return biker.getBoots().getWeight() + biker.getGloves().getWeight() +
                biker.getHelmet().getWeight() + biker.getJacket().getWeight() +
                biker.getPants().getWeight();
    }
}
