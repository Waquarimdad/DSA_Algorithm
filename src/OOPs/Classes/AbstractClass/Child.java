package OOPs.Classes.AbstractClass;

import OOPs.Classes.ImportantPointInJava.ParentClass;

public class Child extends Parent {
    Child(int age) {
       super(age);
    }

    @Override
    void message() {
        super.message();
    }

    @Override
    void career() {
        System.out.println("Inside child career method");
    }

    @Override
    void partner() {

    }
}
