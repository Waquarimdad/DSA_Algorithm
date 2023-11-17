package OOPs.Classes.Genrics.GenricArrayList;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] array;
    private static final int DEFAULT_SIZE = 10;

    private int size = 0;
    CustomGenericArrayList() {
        this.array = new Object[DEFAULT_SIZE];
    }

    void add(int number) {
        if (arrayIsFull()) {
            resize();
        }
        array[size++] = number;
    }

    private void resize() {
        Object[] tempArray = new Object[array.length * 2];
        int i = 0;
        while (i < array.length) {
            tempArray[i] = array[i];
            i++;
        }
        array = tempArray;
    }

    T remove(){
       T removed = (T) array[--size];
       return removed;
    }

    T get (int index) {
        return (T) array[index];
    }

    int size() {
        return size;
    }

    private boolean arrayIsFull() {
        return size == array.length;
    }

    void set (int index, T value) {
        array[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(23);
        System.out.println(list);
    }
}
