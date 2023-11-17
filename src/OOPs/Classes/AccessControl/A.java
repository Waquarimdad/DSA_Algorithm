package OOPs.Classes.AccessControl;

public class A {
    /*
        We hide the data members from outside world or we can say that from other class or package by encapsulating it using private access modifier.
     */
    private int number;
    private String name;
    private int[] array;

    protected int item;

    public A() {

    }

    public A(int number, String name) {
        this.number = number;
        this.name = name;
        this.array = new int[number];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
