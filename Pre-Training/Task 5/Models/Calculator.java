package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

import by.epam.preTraining.SiarheiHuba.tasks.task5.View.View;

public class Calculator {
    public static double getPercentageOfInsuredContainers(Warehouse<Container> wHouse){
        int ins = 0, total = 0;
        int size = wHouse.getAmountOfSpots();
        for (int i=0; i<size; i++){
            try {
                if (wHouse.getContainerByIndex(i).isInsured())
                    ins++;
                total++;
            } catch (NullPointerException e){
                View.view("Empty Spot");}
        }
        return (double)ins/total*100;
    }
}
