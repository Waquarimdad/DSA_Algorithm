package OOPs.Classes.InterfaceExample;

public class DaoClass {
    private final DaoInterface daoInterface; // but the reference type here is of dao class interface

    DaoClass() {
        daoInterface = new DaoClassImpl(); // we cant create an object of the abstract class or an interface, so I am implementing it and creating na
        // object of that class
    }

    void start() {
        daoInterface.start();
    }

    void end() {
        daoInterface.end();
    }

}
