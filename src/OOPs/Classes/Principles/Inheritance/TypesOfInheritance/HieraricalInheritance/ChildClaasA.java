package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.HieraricalInheritance;

public class ChildClaasA extends ParentClass {
    int weight;

    ChildClaasA() {
        super();
        this.weight = -1;
    }

    public ChildClaasA(int height, int width, int breadth, int weight) {
        super(height, width, breadth);
        this.weight = weight;
    }
}
