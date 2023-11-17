package Revision.AbstractClass;

import Revision.Interface.B;

public class Main implements B {

    @Override
    public void message() {
        System.out.println("I am the interface that was created in the A interface");
    }

    @Override
    public void run() {
        System.out.println("I am the interface that was created in the B interface");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.message();
        main.run();
    }
}
