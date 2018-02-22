package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

public class Warehouse<Container> implements Storage<Container> {

    private int spotsQuantity;
    private int[] availableSpots;
    private int spotsAvailable;
    private Container[] warehouse;
    private int spotID = 1;
    private int arrayLength;
    private static int ARRAY_INCREASE_SIZE = 10;

    public Warehouse() {
        warehouse = new Container[ARRAY_INCREASE_SIZE];
    }

    public Container getContainerByIndex(int index) {
        return (Container) warehouse[index];
    }

    public int getAmountOfVacantSpots() {
        return warehouse.length - spotID + 1;
    }

    public int getAmountOfTakenSpots() {
        return warehouse.length;
    }

    public boolean isFull() {
        return spotsAvailable == 0;
    }

    public boolean isEmpty() {
        return spotsAvailable == spotsQuantity;
    }

    public int size() {
        return spotsQuantity;
    }

    public void add(Container unit) {
        if (warehouse.length == spotID)
            addMoreSpaceToArray();
        warehouse[spotID] = unit;
        spotID++;
    }

    public void add(Container... unit) {
        for (Container x : unit) {
            if (warehouse.length == spotID)
                addMoreSpaceToArray();
            warehouse[spotID] = x;
            spotID++;
        }
    }

    public boolean checkIfContainedByContainerID(int containerIDtoCheck){
        boolean result = false;
        for(Container cont: warehouse){
            if (cont.getContainerID() == containerIDtoCheck)
                result = true;
        }
        return result;
    }

    public boolean checkSeveralIfContainedByContainerIDs (int... containerIDstoCheck){
        int num = containerIDstoCheck.length;
        int res = 0;
        for (Container cont: warehouse){
            for (int i: containerIDstoCheck){
                if (cont.getContainerID() == i)
                    res++;
            }
        }
        return num==res;
    }

    public void addMoreSpaceToArray() {
        Container[] warehouseReplaser = new Container[warehouse.length + ARRAY_INCREASE_SIZE];

        for (int i = 0; i < warehouse.length; i++) {
            warehouseReplaser[i] = warehouse[i];
        }
        warehouse = warehouseReplaser;
    }

    public void remove(int index) {
        warehouse[index] = null;
    }

    public void eraseBase(){
        warehouse = null;
    }

    public boolean contains(Object unit) {
        return false;
    }
}
