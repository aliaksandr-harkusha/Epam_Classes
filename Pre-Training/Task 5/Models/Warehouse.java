package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

import by.epam.preTraining.SiarheiHuba.tasks.task5.View.View;
import java.util.Arrays;

public class Warehouse<ContainerUnit> implements Storage<ContainerUnit> {

    private ContainerUnit[] warehouse;
    private int loadNumber = 0;
    private int spotsTaken = 0;
    private static int ARRAY_INCREASE_SIZE = 10;
    private int maxWarehouseCapacity;

    public Warehouse(int warehouseCapacity) {
        warehouse = (ContainerUnit[]) new Object[ARRAY_INCREASE_SIZE];
        this.maxWarehouseCapacity = warehouseCapacity;
    }

    public Warehouse() {
        warehouse = (ContainerUnit[]) new Object[ARRAY_INCREASE_SIZE];
        this.maxWarehouseCapacity = 5000;
    }

    public int getTakenSpotsQuantity() {
        return spotsTaken;
    }

    public int getVacantSpaces() {
        return maxWarehouseCapacity - spotsTaken;
    }

    public ContainerUnit[] getWarehouse() {
        return warehouse;
    }

    public boolean isEmpty() {
        return spotsTaken == 0;
    }

    public int getSize() {
        return maxWarehouseCapacity;
    }

    public int getIndex(ContainerUnit unit) {
        for (int i = 0; i < loadNumber; i++) {
            try {
                if (warehouse[i].equals(unit))
                    return i;
            } catch (NullPointerException e) {
            }
        }
        return -1;
    }

    public ContainerUnit getContainerByIndex(int index) {
        ContainerUnit unit;
        try {
            unit = warehouse[index];
            return unit;
        } catch (NullPointerException e) {
            View.view("Container with index " + index + " doesn't exist");
            return null;
        }
    }

    public boolean isFull() {
        return maxWarehouseCapacity == spotsTaken;
    }

    public void add(ContainerUnit unit) {
        if (warehouse.length == loadNumber)
            addMoreSpaceToArray();
        warehouse[loadNumber] = unit;
        loadNumber++;
        spotsTaken++;
    }

    public void addMultiple(ContainerUnit... unit) {
        for (ContainerUnit x : unit) {
            add(x);
        }
    }

    public void setMaxWarehouseCapacity(int maxWarehouseCapacity) {
        this.maxWarehouseCapacity = maxWarehouseCapacity;
    }

    public int getMaxWarehouseCapacity() {
        return maxWarehouseCapacity;
    }

    public boolean contains(ContainerUnit unit) {
        return getIndex(unit) != -1;
    }

    public boolean containsSeveral(ContainerUnit... units) {
        boolean res = true;
        for (ContainerUnit i : units) {
            if (getIndex(i) == -1)
                res = false;
        }
        return res;
    }

    public void addMoreSpaceToArray() {
        ContainerUnit[] warehouseReplaser = (ContainerUnit[]) new Object[warehouse.length + ARRAY_INCREASE_SIZE];
        for (int i = 0; i < warehouse.length; i++) {
            warehouseReplaser[i] = warehouse[i];
        }
        warehouse = warehouseReplaser;
    }

    public void removeByID(int index) {
        warehouse[index] = null;
        spotsTaken--;
    }

    public int getNextLoadNumber() {
        return loadNumber;
    }

    public void eraseBase() {
        warehouse = null;
        spotsTaken = 0;
    }

    @Override
    public int hashCode() {
        return 42 * (this.getMaxWarehouseCapacity() + this.getTakenSpotsQuantity() + this.getNextLoadNumber());
    }

    @Override
    public String toString() {
        return "Warehouse has capacity of " + maxWarehouseCapacity + " spots, currently has " + getVacantSpaces() +
                " vacant spaces.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Warehouse<ContainerUnit> warehouse1 = (Warehouse<ContainerUnit>) o;
        if (loadNumber != warehouse1.loadNumber) return false;
        if (spotsTaken != warehouse1.spotsTaken) return false;
        if (maxWarehouseCapacity != warehouse1.maxWarehouseCapacity) return false;
        return Arrays.equals(warehouse, warehouse1.warehouse);
    }
}
