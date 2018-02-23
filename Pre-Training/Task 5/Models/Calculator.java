package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

public class Calculator {
    public static double getPercentageOfInsuredContainers(Container[] wHouse){
        int ins = 0;
        for (Container x: wHouse){
            if (x.isInsured())
                ins++;
        }
        return ins/wHouse.length;
    }


}
