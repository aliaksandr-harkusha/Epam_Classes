package by.epam.preTraining.SiarheiHuba.tasks.Task8.Model;

import by.epam.preTraining.SiarheiHuba.tasks.Task5.Model.ContainerUnit;
import by.epam.preTraining.SiarheiHuba.tasks.Task5.Model.Warehouse;

public class Searcher {
    static int Z = 0;

    public boolean searchContainerUnitByIndex(ContainerUnit unit, Warehouse base) {
        for (int i = 0; i < base.getSize(); i++) {
            if (base.getContainerByIndex(i).equals(unit)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchContainerUnitByIndexRecursion(ContainerUnit unit, Warehouse base) {
        if (base.getSize() == 0) return false;
        if (base.getContainerByIndex(Z).equals(unit))
            return true;
        else if (Z == base.getSize()) return false;
        else {
            Z++;
            searchContainerUnitByIndexRecursion(unit, base);
        }
        return false;
    }
}
