package OOPs.Classes.Genrics.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {
    private int[] array;
    private static final int DEFAULT_SIZE = 10;

    private int size = 0;

    CustomArrayList() {
        /*
            We creating an object of the array and initialized it with the default size inside the constructor.
         */
        this.array = new int[DEFAULT_SIZE];
    }

    void add(int number) {
        if (arrayIsFull()) {
            resize();
        }
        array[size++] = number;
    }

    private void resize() {
        int[] tempArray = new int[array.length * 2];
        int i = 0;
        while (i < array.length) {
            tempArray[i] = array[i];
            i++;
        }
        array = tempArray;
    }

    void remove(){
        int i = array[--size];
    }

    int get (int index) {
        return array[index];
    }

    int size() {
        return size;
    }

    private boolean arrayIsFull() {
        return size == array.length;
    }

    void set (int index, int value) {
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
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
