package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.MultiLevelInheritance;

public class C extends B {
    int pieces;
    C() {
        super();
        this.pieces = 0;
    }

    public C (int breadth, int length, int height, int weight, int pieces) {
        super(breadth, length, height, weight);
        this.pieces = pieces;
    }
}
