package Revision.AbstractClass;

public abstract class Test {
    private String name; // this is called Encapsulation, that means we r hiding the data from outside world.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // We are able to create a normal constructor inside the abstract class but we can't create an abstract constructor.
    Test(String name) {
        this.name = name;
    }

    Test() {

    }
    abstract void start();
    abstract void stop();
}
