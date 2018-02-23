package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

public class Warehouse<Container> implements Storage<Container>{

    private Container[] warehouse;
    private int spotID = 0;
    private static int ARRAY_INCREASE_SIZE = 10;

    public Warehouse() {
        warehouse = (Container[]) new Object[ARRAY_INCREASE_SIZE];
    }

    public Container[] getWarehouse() {
        return warehouse;
    }

    public Container getContainerByIndex(int index) {
        return (Container) warehouse[index];
    }

    public int getAmountOfVacantSpots() {
        return warehouse.length - spotID;
    }

    public int getAmountOfSpots() {
        return warehouse.length;
    }

    public boolean isFull() {
        return warehouse.length - spotID == 0;
    }

    public boolean isEmpty() {
        return spotID == 0;
    }

    public int size() {
        return warehouse.length;
    }

    public void add(Container unit) {
        if (warehouse.length == spotID)
            addMoreSpaceToArray();
        warehouse[spotID] = unit;
        spotID++;
    }

    public void addMultiple(Container... unit) {
        for (Container x : unit) {
            add(x);
        }
    }

    /*
    public boolean checkIfContainedByContainerID(int containerIDtoCheck) {
        boolean result = false;
        for (Container cont : warehouse) {
            if (cont.getContainerID() == containerIDtoCheck)
                result = true;
        }
        return result;
    }

    public boolean checkSeveralIfContainedByContainerIDs(int... containerIDstoCheck) {
        int num = containerIDstoCheck.length;
        int res = 0;
        for (Container cont : warehouse) {
            for (int i : containerIDstoCheck) {
                if (cont.getContainerID() == i)
                    res++;
            }
        }
        return num == res;
    }

    */

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addMoreSpaceToArray() {
        Container[] warehouseReplaser = (Container[]) new Object[warehouse.length + ARRAY_INCREASE_SIZE];

        for (int i = 0; i < warehouse.length; i++) {
            warehouseReplaser[i] = warehouse[i];
        }
        warehouse = warehouseReplaser;
    }

    public void remove(int index) {
        warehouse[index] = null;
    }

    public void eraseBase() {
        warehouse = null;
        spotID = 0;
    }

    public boolean contains(Object unit) {
        return false;
    }
}

