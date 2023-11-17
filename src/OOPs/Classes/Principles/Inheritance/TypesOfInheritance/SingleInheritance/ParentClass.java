package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.SingleInheritance;

public class ParentClass {
    /*
        Single Inheritance: One class extends another class or we can say that child class extends the parent class.
     */
    int height;
    int width;
    int breadth;
    ParentClass() {
        this.height = -1;
        this.width = -1;
        this.breadth = -1;
    }

    ParentClass(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
}
