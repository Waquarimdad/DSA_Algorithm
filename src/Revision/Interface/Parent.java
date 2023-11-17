package Revision.Interface;

public class Parent {
    int noOfGear;
    String engine;

    Parent() {

    }

    Parent(int noOfGear, String engine) {
        this.noOfGear = noOfGear;
        this.engine = engine;
    }

    void startEngine() {
        System.out.println("Engine is stated in the Parent class..");
    }
}
