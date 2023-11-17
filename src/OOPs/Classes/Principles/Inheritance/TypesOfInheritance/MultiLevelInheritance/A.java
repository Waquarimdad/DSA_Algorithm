package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.MultiLevelInheritance;

public class A {
    /*
        Multilevel Inheritance: B class inherit A class and C class inherit B class.
        This type of inheritance is called multilevel inheritance. (B(child class) extends A(parent class) and C(child class) extends B(parent class))
     */
    int breadth;
    int length;
    int height;

    A() {
        this.breadth = -1;
        this.length = - 1;
        this.height = - 1;
    }

    public A(int breadth, int length, int height) {
        this.breadth = breadth;
        this.length = length;
        this.height = height;
    }
}
