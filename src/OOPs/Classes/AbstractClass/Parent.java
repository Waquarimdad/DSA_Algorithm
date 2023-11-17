package OOPs.Classes.AbstractClass;

abstract class Parent {
    int age;

    Parent(int age) {
        this.age = age;
    }

    static void print() {
        System.out.println("I am abstract method without an object");
    }

    void message() {
        System.out.println("I am also able to print");
    }

    abstract void career();
    abstract void partner();
}
