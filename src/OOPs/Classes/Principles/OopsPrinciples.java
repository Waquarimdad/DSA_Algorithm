package OOPs.Classes.Principles;

public class OopsPrinciples {
    /*
        There are four fundamentals principles/properties of the OOP system.
        1. Inheritance : (The properties that is inherited by the child class from the base/parent class) is known as (inheritance).
                         In order to access base class from the child class we use (extends keyword).
        2. Polymorphism
        3. Encapsulation
        4. Abstraction
     */
    String name;
    int age;
    String gender;

    void message() {
        System.out.println("Hello world");
    }
    void displaySomeInfo(String name, String gender) {
        System.out.println("Name: " + name + " Gender: " + gender);
    }
}
class Child extends OopsPrinciples {
    int age;

    public static void main(String[] args) {
        Child child = new Child();
        Child love = new Child();
        child.message();
        child.displaySomeInfo("Waqaur Imdad", "Male");
        love.displaySomeInfo("Sadaf Shaheen", "Female");
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
