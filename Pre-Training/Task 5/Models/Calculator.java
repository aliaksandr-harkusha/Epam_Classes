package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

public class Calculator {
    public static double getPercentageOfInsuredContainers(Warehouse<ContainerUnit> wHouse) {
        int ins = 0, total = 0;
        int size = wHouse.getNextLoadNumber();
        for (int i = 0; i < size; i++) {
            try {
                if (wHouse.getContainerByIndex(i).isInsured())
                    ins++;
                total++;
            } catch (NullPointerException e) {
            }
        }
        return ins / total * 100;
    }

    public static int getAmountOfVacantSpots(Warehouse<ContainerUnit> wHouse) {

        int size = wHouse.getNextLoadNumber();
        int counter = 0;
        for (int i = 0; i < size; i++) {
            try {
                if (wHouse.getContainerByIndex(i) != null)
                    counter++;
            } catch (NullPointerException e) {
            }
        }
        return wHouse.getMaxWarehouseCapacity() - counter;
    }

    public static long getAverageStorageTime(Warehouse<ContainerUnit> wHouse) {
        int size = wHouse.getNextLoadNumber();
        long days = 0;
        int counter = 0;
        long total = 0;
        for (int i = 0; i < size; i++) {
            try {
                days = (wHouse.getContainerByIndex(i).getDepartureDate().getTimeInMillis() -
                        wHouse.getContainerByIndex(i).getArrivalDate().getTimeInMillis());
                total = total + days / (24 * 60 * 60 * 1000);
                counter++;
            } catch (NullPointerException e) {
            }
        }
        return total / counter;
    }
}
