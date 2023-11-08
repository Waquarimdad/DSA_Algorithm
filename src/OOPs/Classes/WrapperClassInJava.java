package OOPs.Classes;

public class WrapperClassInJava {
    public static void main(String[] args) {
        int a = 10; // primitive data type
        int b = 20; // primitive data type
        /*
        Integer is final. Here questions aries what's the final keyword that we r dealing with..
        Final keyword: using (final) keyword we (preventing our variables to modified in near future)
        Note: Final variable has to be initialized. Always initialized the final variable while declaring  it.
        But unfortunately final guarantees immutability only when instance variables are of primitive type and not the referenced type.
        If we use final keyword for the object then we can modify it's variables but not reassign it's.
        Example: final Student student = new Student();
                  student.name = "new name";
                  kunal = other object. (We can't do this)
         */
        Integer number = 15; // this is an object instead of a primitive type
        /*
        we only have pass by value in java we don't have pass by reference
         */
        Integer digit = 890; // this is also an object
        swap(number, digit);
        System.out.println("Number: " + number + "," + "Digit: " + digit);
        swap(a, b);
        System.out.println("Original A: " + a + "," + "Original B: " + b);

        final A human = new A("Sachin Ramesh Tendulkar");
        human.name = "Rahul Dravid";
        System.out.println(human.name);
        /*
        Cannot assign a value to final variable 'human'. When a non primitive is final, we can't reassign it
         */
//        human = new A("Sachin R");
    }
    /*
    However, when we pass an object to a method in Java, the "value" being passed is actually the reference to the object in memory
    (not the actual object itself). This might give the illusion of (pass-by-reference behavior) because changes to the object that the
    reference points to (like calling a setter on the object) will persist outside the method.
     */
    static void swap(Integer number, Integer digit) {
        int temp = number;
        number = digit;
        digit = temp;

        System.out.println("Number: " + number + "," + "Digit: " + digit);
    }
    /*
    That's correct. Java is strictly pass-by-value. When we pass a variable to a method, a new copy of the variable is created in the method stack
    frame. Any changes made in the method do not affect the original variable
     */
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: " + a + "," + "B: " + b);
    }
}
class A {
    final int value = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
