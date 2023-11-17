package OOPs.Classes.Principles.Inheritance.Defination;

public class ChildBox extends ParentBox {
    double weight;

    ChildBox() {
        super();
        this.weight = -1;
    }

    ChildBox(double length, double height, double width, double weight) {
        /*
        Super keyword: What is this? It is nothing but calls the parent class constructor.
        Used to initialize values present in the parent class.
         */
        super(length, height, width);
        /*
        if we are not declared super keyword here it will takes non parameterized constructor of the parent class.
         */
        this.weight = weight;
        /*
        we are able to access the weight variable in the child class by using the (this) keyword.
        But in order to access the weight variable of the parent class we need to do it by using (super) keyword.
         */
        System.out.println(this.weight);
        System.out.println(super.weight);
        /*
        Super class does not have idea what base class contains.
        If we put super(length, height, width); below the variable declaration in the child class, it throws an exception.
        Note: Child class cares about what parent class contains, therefore it ask parent class to initialize first.
         */
    }
    ChildBox(ChildBox other) {
        super(other);
        this.weight = other.weight;
    }
}
