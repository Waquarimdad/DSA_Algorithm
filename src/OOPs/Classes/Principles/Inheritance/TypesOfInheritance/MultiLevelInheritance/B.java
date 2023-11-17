package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.MultiLevelInheritance;

public class B extends A {
    int weight;

    B() {
        super();
        this.weight = -1;
    }

    B (int breadth, int length, int height, int weight) {
        super(breadth, length, height);
        this.weight = weight;
    }
}
