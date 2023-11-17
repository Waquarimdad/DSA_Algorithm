package Revision.Generic;

import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<T> {
    private Object[] array;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.array = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isArrayIsFull()) {
            resize();
        }
        array[size++] = value;
    }

    private void resize() {
        Object[] tempArray = new Object[2 * array.length];
        int i = 0;
        while (i < array.length) {
            tempArray[i] = array[i];
            i++;
        }
        array = tempArray;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    private boolean isArrayIsFull() {
        return size == array.length;
    }
}
