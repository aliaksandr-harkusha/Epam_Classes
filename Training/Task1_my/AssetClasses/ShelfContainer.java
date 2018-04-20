package Task1.Model.AssetClasses;

import Task1.Model.AssetClasses.Gear.*;

import java.util.*;

public class ShelfContainer {
    private Random r = new Random();
    private ArrayList<Boots> bootsShelf = new ArrayList<Boots>();
    private ArrayList<Gloves> glovesShelf = new ArrayList<Gloves>();
    private ArrayList<Helmet> helmetsShelf = new ArrayList<Helmet>();
    private ArrayList<Jacket> jacketsShelf = new ArrayList<Jacket>();
    private ArrayList<Pants> pantsShelf = new ArrayList<Pants>();
    private ArrayList<MotorcycleGear> entireEnvintory = new ArrayList<MotorcycleGear>();

    public void sortEnvintoryByWeight() {
        Collections.sort(bootsShelf);
        Collections.sort(glovesShelf);
        Collections.sort(helmetsShelf);
        Collections.sort(jacketsShelf);
        Collections.sort(pantsShelf);
    }

    public ArrayList<MotorcycleGear> getEntireGearList() {
        entireEnvintory.addAll(bootsShelf);
        entireEnvintory.addAll(glovesShelf);
        entireEnvintory.addAll(helmetsShelf);
        entireEnvintory.addAll(jacketsShelf);
        entireEnvintory.addAll(pantsShelf);
        return entireEnvintory;
    }

    public ArrayList<MotorcycleGear> getItemsWithinPriceRange(int minPrice, int maxPrice) {
        ArrayList<MotorcycleGear> sortedList = new ArrayList<MotorcycleGear>();
        for (MotorcycleGear g : getEntireGearList()) {
            if (g.getPrice() > minPrice && g.getPrice() < maxPrice)
                sortedList.add(g);
        }
        return sortedList;
    }

    public void addBoots(Boots boot) {
        bootsShelf.add(boot);
    }

    public void addGloves(Gloves gloves) {
        glovesShelf.add(gloves);
    }

    public void addHelmet(Helmet helmet) {
        helmetsShelf.add(helmet);
    }

    public void addJacket(Jacket jacket) {
        jacketsShelf.add(jacket);
    }

    public void addPants(Pants pants) {
        pantsShelf.add(pants);
    }

    public Boots getRandomBoots() {
        return bootsShelf.get(r.nextInt(bootsShelf.size()));
    }

    public Gloves getRandomGloves() {
        return glovesShelf.get(r.nextInt(glovesShelf.size()));
    }

    public Helmet getRandomHelmets() {
        return helmetsShelf.get(r.nextInt(helmetsShelf.size()));
    }

    public Jacket getRandomJackets() {
        return jacketsShelf.get(r.nextInt(jacketsShelf.size()));
    }

    public ArrayList<Boots> getBootsShelf() {
        return bootsShelf;
    }

    public ArrayList<Gloves> getGlovesShelf() {
        return glovesShelf;
    }

    public ArrayList<Helmet> getHelmetsShelf() {
        return helmetsShelf;
    }

    public ArrayList<Jacket> getJacketsShelf() {
        return jacketsShelf;
    }

    public ArrayList<Pants> getPantsShelf() {
        return pantsShelf;
    }

    public Pants getRandomPants() {

        return pantsShelf.get(r.nextInt(pantsShelf.size()));
    }
}
