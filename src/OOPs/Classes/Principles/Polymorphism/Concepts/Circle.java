package OOPs.Classes.Principles.Polymorphism.Concepts;

public class Circle extends Shape{

    /*
        this will run when object of circle is created.
        hence it is overriding the parent method
     */
    @Override
    void area(){
        System.out.println("Area is pie * radius * radius");
    }
}
