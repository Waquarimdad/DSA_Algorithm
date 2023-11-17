package OOPs.Classes.Keywords;

public class FinalKeyword {

    /*
        1. Final keyword is used to prevent modification of the variables or methods.
        2. Final keyword is used to prevent overriding.
        3. Through final keyword we achieved total immutability.
        4. We also used to prevent inheritance as well.
        Note: Methods which are declared final can provide performance enhancements. Because compiler is free to inline the calls
        to them as compiler will know the method is declared as final and it can't be overridden.

        Whenever we put a class as a final then it implicitly declared all its methods as a final too...
     */

    /*
        Early binding and late binding. What's this? For this check notes.

        (Early binding), also known as static binding, occurs at compile time. It involves linking a method call with the method body during compilation.
        This means that the method to be called is determined during the compile-time based on the type of reference variable.

        (Late binding), on the other hand, is also called dynamic binding or runtime polymorphism. It happens at runtime, where the method call is
        resolved during program execution. In Java, late binding is achieved through method overriding. The actual method that gets executed is
        determined by the type of object at runtime.
     */
}
