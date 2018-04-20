package by.epam.SiarheiHuba.src.Task1.Controller;

import by.epam.SiarheiHuba.src.Task1.Model.ActionClasses.BikerManipulator;
import by.epam.SiarheiHuba.src.Task1.Model.ActionClasses.Calculator;
import by.epam.SiarheiHuba.src.Task1.Model.ActionClasses.GearCreator;
import by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Biker;
import by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.ShelfContainer;
import by.epam.SiarheiHuba.src.Task1.View.View;

public class Runner {
    public static void main(String[] args) {
        Biker biker = new Biker();
        ShelfContainer shelf = new ShelfContainer();

        Runner.printSortedHelmetShelf(shelf);
        Runner.printItemsWithinPriceRange(100, 200, shelf);
        Runner.printEntireGearList(shelf);
        Runner.printNewDressedBikerFromShelf(biker, shelf);
        Runner.printBikerTotalGearCost(biker);
        Runner.generateAndPrintNewDressedBiker();
        Runner.generateAndPrintNewRandomlyDressedBiker();
    }

    public static void printSortedHelmetShelf(ShelfContainer shelf) {
        GearCreator.fillContainerFromStock(shelf);
        shelf.sortEnvintoryByWeight();
        View.view("Helmet shelf: " + shelf.getHelmetsShelf());
    }

    public static void printItemsWithinPriceRange(int min, int max, ShelfContainer shelf) {
        View.view(String.format("Items within %d and %d price range: ", min, max)
                + shelf.getItemsWithinPriceRange(min, max));

    }

    public static void printEntireGearList(ShelfContainer shelf) {
        View.view("Entire gear list: " + shelf.getEntireGearList());
    }

    public static void printNewDressedBikerFromShelf(Biker biker, ShelfContainer shelf) {
        BikerManipulator.dressBikerUpEASY(biker, shelf);
        View.view(biker);
    }

    public static void printBikerTotalGearCost(Biker biker) {
        View.view(String.format("%s gear cost is %.2f ", biker.getName(), Calculator.getBikerGearCost(biker)));
    }

    public static Biker generateAndPrintNewDressedBiker() {
        Biker newNoNameBiker = BikerManipulator.dressedBikerCreator();
        View.view("New Biker: " + newNoNameBiker);
        return newNoNameBiker;
    }

    public static Biker generateAndPrintNewRandomlyDressedBiker() {
        Biker newRandomBiker = BikerManipulator.randomlyDressedBikerCreator();
        View.view("New Random Biker: " + newRandomBiker);
        return newRandomBiker;
    }
}

