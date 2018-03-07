package by.epam.preTraining.SiarheiHuba.tasks.Task8.Model;

import by.epam.preTraining.SiarheiHuba.tasks.Task5.Model.ContainerUnit;

public class Sorter {

    public ContainerUnit[] bubbleSorter(ContainerUnit[] base) {
        int x = base.length;
        for (int i = 1; i < x; i++) {
            for (int z = 1; z < x + 1 - i; z++)
                if (base[z].getContainerID() < base[z - 1].getContainerID()) {
                    ContainerUnit tempUnit = base[z];
                    base[z] = base[z - 1];
                    base[z - 1] = tempUnit;
                }
        }
        return base;
    }

    public ContainerUnit[] insertionSorter(ContainerUnit[] base) {
        int x = base.length;
        for (int i = 1; i < x; i++) {
            ContainerUnit tempUnit = base[i];
            int z = i;
            while (z > 0 && tempUnit.getContainerID() < base[z - 1].getContainerID()) {
                base[z] = base[z - 1];
                base[z - 1] = tempUnit;
                z--;
            }
        }
        return base;
    }

    public ContainerUnit[] selectionSorter(ContainerUnit[] base) {
        int x = base.length - 1;
        for (int i = 0; i < x; i++) {
            ContainerUnit minUnit = base[i];
            int minIndex = i;
            for (int i2 = 1 + i; i2 < base.length; i2++) {
                if (base[i2].getContainerID() < minUnit.getContainerID()) {
                    minUnit = base[i2];
                    minIndex = i2;
                }
                base[minIndex] = base[i];
                base[i] = minUnit;
            }

        }
        return base;
    }

    public ContainerUnit[] mergeSorter(ContainerUnit[] base) {

        int z = base.length;
        int halfZ = base.length / 2;
        if (base.length == 1)
            return base;

        ContainerUnit[] base1 = new ContainerUnit[z];
        ContainerUnit[] base2 = new ContainerUnit[z - halfZ];

        for (int i = 0; i < halfZ; i++) {
            base1[i] = base[i];
        }
        for (int i = halfZ; i < z; i++) {
            base2[i - halfZ] = base[i];
        }
        base1 = mergeSorter(base1);
        base2 = mergeSorter(base2);

        return merge(base1, base2);
    }

    public ContainerUnit[] merge(ContainerUnit[] base1, ContainerUnit[] base2) {
        int b1Size = base1.length;
        int b2Size = base2.length;
        int b1Taker = 0;
        int b2Taker = 0;
        int sum = b1Size + b2Size;
        ContainerUnit[] finalBase = new ContainerUnit[sum];

        for (int i = 0; i < sum; i++) {
            if (b1Taker == b1Size) {
                finalBase[i] = base2[b2Taker];
                b2Taker++;
            } else if (b2Taker == b2Size) {
                finalBase[i] = base1[b1Taker];
                b2Taker++;
            } else if (base1[b1Taker].getContainerID() < base2[b2Taker].getContainerID()) {
                finalBase[i] = base1[b1Taker];
                b1Taker++;
            } else {
                finalBase[i] = base2[b2Taker];
                b2Taker++;
            }
        }
        return finalBase;
    }

    public void switchTwoUnits(ContainerUnit unit1, ContainerUnit unit2) {
        ContainerUnit temp = unit1;
        unit1 = unit2;
        unit2 = temp;
    }

    public void switchTwoNumbers(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public void quickSort(ContainerUnit[] base) {
        int size = base.length;
        quickSortEngine(0, size - 1, base);
    }

    public void quickSortEngine(int lowerWall, int higherWall, ContainerUnit[] base) {

        int i = lowerWall;
        int j = higherWall;
        ContainerUnit pivot = base[lowerWall + (higherWall - lowerWall) / 2];
        while (i <= j) {
            while (base[i].getContainerID() < pivot.getContainerID()) {
                i++;
            }
            while (base[j].getContainerID() > pivot.getContainerID()) {
                j--;
            }
            if (i <= j) {
                switchTwoNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerWall < j)
            quickSortEngine(lowerWall, j, base);
        if (i < higherWall)
            quickSortEngine(i, higherWall, base);
    }
}
