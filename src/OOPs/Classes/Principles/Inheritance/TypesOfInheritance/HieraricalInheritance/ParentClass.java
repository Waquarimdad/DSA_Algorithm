package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.HieraricalInheritance;

public class ParentClass {
    /*
        Hierarchical Inheritance: One class is inherited by many other classes, this we called the hierarchical inheritance.
     */
    int height;
    int width;
    int breadth;

    ParentClass() {
        this.height = -1;
        this.width = -1;
        this.breadth = -1;
    }

    public ParentClass(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
}
