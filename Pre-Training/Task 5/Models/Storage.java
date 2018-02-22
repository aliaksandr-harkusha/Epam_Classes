package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

public interface Storage<X> {
    boolean isFull();
    boolean isEmpty();
    int size();
    void add(X unit);
    void remove(int index);
    boolean contains(X unit);
}
