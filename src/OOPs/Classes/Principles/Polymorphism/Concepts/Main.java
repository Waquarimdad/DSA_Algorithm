package OOPs.Classes.Principles.Polymorphism.Concepts;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        Circle circle = new Circle();
        circle.area();
        Square square = new Square();
        square.area();
        Triangle triangle = new Triangle();
        triangle.area();

        Shape polymorphism = new Circle();
        /*
            Question arises: How it calls the function of the circle class but the reference variable type is of shape.
            Answer: When we create an object of child class then the priority is given to the child class methods.

            Example: Shape polymorphism = new Circle();
            Here which methods is called depends on (new Circle() object) which we r creating.
            And this is known as (Upcasting).
            (This is how overriding works.)

            Question: How JVM knows which methods to call internally. As we know now it will call child class methods..
            Answer: JVM knows by concept called Dynamic Method Dispatch (VVImportant).
            Dynamic Method Dispatch: It's a mechanism by which a call to an overridden method is resolved at runtime rather than at
            compile time.
         */
        polymorphism.area();
    }
}
