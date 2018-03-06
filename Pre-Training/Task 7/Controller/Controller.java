package by.epam.preTraining.SiarheiHuba.tasks.Task7.Controller;

import by.epam.preTraining.SiarheiHuba.tasks.Task7.Model.Tree;
import by.epam.preTraining.SiarheiHuba.tasks.Task7.View.View;

public class Controller {

    public static void main(String[] args) {
        Tree<Integer> newTree = new Tree<Integer>();
        newTree.add(9);
        newTree.add(10);
        newTree.add(3);
        newTree.remove(9);
        newTree.add(2);
        newTree.add(10);
        newTree.add(3);
        View.view(newTree.getSize());
    }

}
