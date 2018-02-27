package by.epam.preTraining.SiarheiHuba.tasks.task6.Model;

public class Queue {

    Object[] array;
    public static int INCREASE_SIZE = 10;
    int lastIndex = 0;
    int finalSize;
    int firstIndex = 0;

    public Queue(int finalSize) {
        this.array = new Object[finalSize];
        this.finalSize = finalSize;
    }

    public Queue() {
        this.array = new Object[INCREASE_SIZE];
    }

    //    enqueue(): метод добавляет элемент в конец очереди;
    public void push(Object obj) {
        if (array.length == lastIndex)
            addMoreSpaceToArray();
        array[lastIndex] = obj;
        lastIndex++;
    }

    public void addMoreSpaceToArray() {
        Object[] arrayReplaser = new Object[array.length + INCREASE_SIZE];
        for (int i = 0; i < array.length; i++) {
            arrayReplaser[i] = array[i];
        }
        array = arrayReplaser;
    }

    //    dequeue(): метод удаляет первый элемент с одновременным его возвратом из непустой очереди;
    public Object dequeue() {
        if (firstIndex < 1000)
            firstIndex++;
        else shortenQueue();
        return array[firstIndex - 1];
    }

    public void shortenQueue() {
        Object[] arrayReplaser = new Object[lastIndex - firstIndex + INCREASE_SIZE];
        int difference = lastIndex - firstIndex;
        for (int i = 0; i < difference; i++) {
            arrayReplaser[i] = array[firstIndex + i];
        }
        lastIndex = difference;
        firstIndex = 0;
        array = arrayReplaser;
    }


    //    peek(): метод возвращает первый элемент из непустой очереди; метод не должен удалять элемент из очереди;
    public Object peek() {
        return array[firstIndex];
    }

    //    size(): метод возвращает общее количество элементов в очереди.
    public int size() {
        return lastIndex-firstIndex;
    }

    //    isEmpty(): метод возвращает булевское значение true, если очередь является пустой,
    // в противном случае метод должен возвращать false;
    public boolean isEmpty() {
        return lastIndex == firstIndex;
    }

    //    isFull(): метод возвращает булевское значение true, если очередь полностью заполнена,
    // в противном случае метод должен возвращать false.
    public boolean isFull() {
        return lastIndex == finalSize;
    }
}
