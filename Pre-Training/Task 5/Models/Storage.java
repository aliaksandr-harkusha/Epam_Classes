package by.epam.preTraining.SiarheiHuba.tasks.task5.Models;

public interface Storage<T>{
    boolean isFull();
    boolean isEmpty();
    int size();
    void add(T unit);
    void removeByID(int index);
    boolean contains(T unit);
}
