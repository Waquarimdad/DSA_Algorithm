package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.SingleInheritance;

public class ChildClass extends ParentClass{
    int weight;

    ChildClass() {
        super();
        this.weight = -1;
    }

    ChildClass(int height, int width, int breadth, int weight) {
        super(height, width, breadth);
        this.weight = weight;
    }
}
