package Revision.Interface;

public class Child extends Parent {
    int noOfSeats;

    public Child(int noOfGear, String engine, int noOfSeats) {
        super(noOfGear, engine);
        this.noOfSeats = noOfSeats;
    }

    Child() {
        super();
    }

    @Override
    void startEngine() {
        System.out.println("Engine is stated in the child class..");
    }

    void changeSeatColor() {
        System.out.println("Seat color is changed");
    }

    @Override
    public String toString() {
        return "Child{" +
                "noOfSeats=" + noOfSeats +
                ", noOfGear=" + noOfGear +
                ", engine='" + engine + '\'' +
                '}';
    }
}
