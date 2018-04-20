package by.epam.SiarheiHuba.src.Task1.Model.ActionClasses;

import by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Gear.*;
import by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.ShelfContainer;

import java.io.*;
import java.util.Random;

public class GearCreator {

    public MotorcycleGear randomGearCreator() {
        Random r = new Random();
        switch (r.nextInt(4)) {
            case 0:
                return new Pants();
            case 1:
                return new Boots();
            case 2:
                return new Gloves();
            case 3:
                return new Helmet();
            case 4:
                return new Jacket();
            default:
                return null;
        }
    }

    public static void fillContainerFromStock(ShelfContainer shelfContainer) {
        String input;
        String filepath = "Training/by/epam/SiarheiHuba/src/Task1/Model/ActionClasses/ItemsInStock.txt";
        File file = new File(filepath);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((input = bufferedReader.readLine()) != null) {
                String[] s = input.split(" ");
                if (s[0].equals("Gloves"))
                    shelfContainer.addGloves(new Gloves(Double.parseDouble(s[1]), Double.parseDouble(s[2])));
                else if (s[0].equals("Helmet"))
                    shelfContainer.addHelmet(new Helmet(Double.parseDouble(s[1]), Double.parseDouble(s[2])));
                else if (s[0].equals("Jacket"))
                    shelfContainer.addJacket(new Jacket(Double.parseDouble(s[1]), Double.parseDouble(s[2])));
                else if (s[0].equals("Pants"))
                    shelfContainer.addPants(new Pants(Double.parseDouble(s[1]), Double.parseDouble(s[2])));
                else if (s[0].equals("Boots"))
                    shelfContainer.addBoots(new Boots(Double.parseDouble(s[1]), Double.parseDouble(s[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
