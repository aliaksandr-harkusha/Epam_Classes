package Task1.Model.ActionClasses;

import Task1.Model.AssetClasses.Biker;
import Task1.Model.AssetClasses.Gear.*;
import Task1.Model.AssetClasses.ShelfContainer;

import java.util.Random;

public class BikerManipulator {

    public static Biker dressedBikerCreator() {
        return new Biker(new Helmet(), new Jacket(), new Gloves(), new Pants(), new Boots());
    }

    public static Biker dressBikerUpEASY(Biker b, ShelfContainer container) {
        if (b.getBoots() == null) b.putOnBoots(container.getRandomBoots());
        if (b.getGloves() == null) b.putOnGloves(container.getRandomGloves());
        if (b.getHelmet() == null) b.putOnHelmet(container.getRandomHelmets());
        if (b.getJacket() == null) b.putOnJacket(container.getRandomJackets());
        if (b.getPants() == null) b.putOnPants(container.getRandomPants());
        return b;
    }

    public static Biker randomlyDressedBikerCreator() {
        Random r = new Random();
        return new Biker(
                new Helmet(r.nextDouble()*300, r.nextDouble()*300),
                new Jacket(r.nextDouble()*1000, r.nextDouble()*3000),
                new Gloves(r.nextDouble()*800, r.nextDouble()*150),
                new Pants(r.nextDouble()*300, r.nextDouble()*300),
                new Boots(r.nextDouble()*300, r.nextDouble()*300));
    }
}
