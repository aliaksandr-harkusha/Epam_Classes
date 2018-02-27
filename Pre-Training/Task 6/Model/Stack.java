package by.epam.preTraining.SiarheiHuba.tasks.task6.Model;

public class Stack {

    Object[] array;
    public static int INCREASE_SIZE = 10;
    int arrayIndex = 0;
    int finalSize;

    public Stack(int finalSize) {
        this.array = new Object[finalSize];
        this.finalSize = finalSize;
    }

    public Stack() {
        this.array = new Object[INCREASE_SIZE];
    }

    //    push(): метод добавляет элемент в конец стека, который называется его вершиной;
    public void push(Object obj) {
        if (array.length == arrayIndex)
            addMoreSpaceToArray();
        array[arrayIndex] = obj;
        arrayIndex++;
    }

    public void addMoreSpaceToArray() {
        Object[] arrayReplaser = new Object[array.length + INCREASE_SIZE];
        for (int i = 0; i < array.length; i++) {
            arrayReplaser[i] = array[i];
        }
        array = arrayReplaser;
    }

    //    pop(): метод удаляет с одновременным возвратом удаляемого элемента из вершины стека, если стек непустой;
    public Object pop() {
        Object x = array[arrayIndex];
        array[arrayIndex] = 0;
        arrayIndex--;
        return x;
    }

    //    peek(): метод возвращает элемент из вершины стека, если стек не пустой; метод не должен удалять элемент из стека;
    public Object peek() {
        return array[arrayIndex];
    }

    //    size(): метод возвращает общее количество элементов в стеке.
    public int size(){
        return arrayIndex;
    }

    //    isEmpty(): метод возвращает булевское значение true, если стек является пустым,
    // в противном случае метод должен возвращать false;
    public boolean isEmpty(){
        return arrayIndex==0;
    }

    //    isFull(): метод возвращает булевское значение true, если стек полностью заполнен,
    // в противном случае метод должен возвращать false.
    public boolean isFull(){
        return arrayIndex==finalSize;
    }
    
    //    isPolindrome: С использованием разработанного абстрактного типа данных Стек (Stack) определите, 
    // является ли заданная строка палиндромом.
    public boolean checkIfThisStringPolindrome(String input) {
        String result = "";
        Stack s = new Stack();
        char[] tempChar = input.toCharArray();
        for (char ch : tempChar) {
            s.push(ch);
        }
        while (!s.isEmpty()) {
            result += s.pop();
        }
        return result.equals(input);
    }
}
