package OOPs.Classes.Keywords;

public class StaticKeyword {
    /*
        When we declares a class or method or variables as a static we don't requires to create an object for that we directly call it by using
        class name.
        Static method can be inherited but not overridden.

        Questions: Can we override static methods.
        Answer: We can't override static methods.

        (Important Note: Overridden depends on the object but static is not depend on the object...)

        Static methods doesn't depend on the object hence they can't be overridden.
     */

    static void greetings() {
        System.out.println("Hello World! This is a greeting message");
    }

    public static void main(String[] args) {
        StaticKeyword.greetings();
    }

}