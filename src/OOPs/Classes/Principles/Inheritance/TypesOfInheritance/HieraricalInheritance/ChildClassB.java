package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.HieraricalInheritance;

public class ChildClassB extends ParentClass {
    int pieces;
    ChildClassB() {
        super();
        this.pieces = 0;
    }

    public ChildClassB(int height, int width, int breadth, int pieces) {
        super(height, width, breadth);
        this.pieces = pieces;
    }
}
