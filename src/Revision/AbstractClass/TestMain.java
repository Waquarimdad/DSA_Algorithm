package Revision.AbstractClass;

public class TestMain extends Test{
    /*
        If we create an constructor in the abstract class we need to create it here in the class which extends the abstract class.
        We can't override the constructor.
     */
    TestMain(String name) {
        super(name);
    }
    TestMain() {
        super();
    }

    @Override
    void start() {
        System.out.println("Starting");
    }

    @Override
    void stop() {
        System.out.println("Stopping");
    }

    public static void main(String[] args) {
        /*
            We can't create an object of the abstract class but we can use it as a reference variable to access the members defined in the class...
         */
        Test test = new TestMain();
        test.start();
        test.stop();
        /*
            Here we r using getter and setter methods to access the private variables declared in the abstract class.
         */
        System.out.println(test.getName());
        test.setName("Imran Khan");
        System.out.println(test.getName());
    }
}
