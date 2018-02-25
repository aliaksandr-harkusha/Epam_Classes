package by.epam.preTraining.SiarheiHuba.tasks.task5.Controller;

import by.epam.preTraining.SiarheiHuba.tasks.task5.Models.Calculator;
import by.epam.preTraining.SiarheiHuba.tasks.task5.Models.ContainerUnit;
import by.epam.preTraining.SiarheiHuba.tasks.task5.Models.Warehouse;
import by.epam.preTraining.SiarheiHuba.tasks.task5.View.View;
import java.util.GregorianCalendar;

public class Controller {

    public static void main(String[] args) {
        Warehouse<ContainerUnit> hangar = new Warehouse<ContainerUnit>(9500);
        hangar.addMultiple(
                new ContainerUnit("HQ42", new GregorianCalendar(2018, 11, 10),
                        new GregorianCalendar(2019, 3, 17),
                true, "usp"),
                new ContainerUnit("HQ40",new GregorianCalendar(2018, 5, 11),
                        new GregorianCalendar(2020, 1, 3),
                        true, "UPS"));
        hangar.add(new ContainerUnit("HQ42", new GregorianCalendar(2017, 9, 10),
                new GregorianCalendar(2018, 3, 1),
                true, "UPS"));
        hangar.add(new ContainerUnit("HQ42", new GregorianCalendar(2018, 3, 10),
                new GregorianCalendar(2019, 12, 15),
                false, "FedEx"));
        hangar.add(new ContainerUnit("HQ40", new GregorianCalendar(2018, 10, 10),
                new GregorianCalendar(2019, 1, 18),
                false, "FedEx"));

        View.view("next SpotID " + hangar.getNextLoadNumber());
        View.view(Calculator.getPercentageOfInsuredContainers(hangar));
        View.view(Calculator.getAverageStorageTime(hangar));
        View.view("Vacant spots: " + Calculator.getAmountOfVacantSpots(hangar));
        View.view("Spots " + hangar.getTakenSpotsQuantity());
        hangar.eraseBase();
        View.view("Spots " + hangar.getTakenSpotsQuantity());
        ContainerUnit un = hangar.getContainerByIndex(2);
    }
}
