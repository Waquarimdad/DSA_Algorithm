package OOPs.Classes;

import java.util.Arrays;

public class TheoryRelatedToClassAndObjet {
    public static void main(String[] args) {
//        // store 5 roll numbers
//        int[] rollNumbers = new int[5];
//        // store 5 names of a students
//        String[] names = new String[5];
//        // lets say we need to store data of 5 students: {rollNumbers, names, marks}
//        float[] marks = new float[5];

        // whenever we create an (instance or object) of the class, the jvm will allocate memory at (runtime)..
        // class is an (theoretical constructor).. and object is the (physical) thing that takes space in the heap memory...

        Student student; // declaring the object
        // declaring it heere, now it is just in the stack memory not pointing to any object, just try to print and check, we r not able to print
        // because it's not yet initialized, so in order to print this we need to first initialized the object..
        student = new Student(); // initialize the object, new Student() is called constructor
        // by using the dot operator we can call the instance variable of the object or set the values.
        student.name = "Waquar Imdad";
        student.marks = 99.99f;
        student.rollNumbers = 1;

        System.out.println(student.name);
        System.out.println(student.rollNumbers);
        System.out.println(student.marks);

        Student[] arrayOfStudent = new Student[5];
        // but for the object it's null.. because it's not initialized..
        System.out.println(Arrays.toString(arrayOfStudent));
        // this is successful with the help of the constructor that we r creating in the class
        Student newStudent = new Student(
               1,
               99.99f,
               "Salman Khan"
        );
        System.out.println(student.name);
        System.out.println(student.rollNumbers);
        System.out.println(student.marks);
    }

    /*
    (Class) is an template/blue print of an object and (object) is the (instance) of the class..
    Example: Car is a template and its (properties) are the object.. each (properties) has an different (values)...
    if we create a class static then we don't need to create an object for this, we directly call the class..
    (Object has an three essentials property: 1. State 2. identity 3. behavior of an object)
    1. State --> it's value from the data type
    Note: Instance Variable:-> Variable inside an object is known as instance variable or variable declare inside the class..
     (VVImportant) (When we create an object, memory is dynamically allocated at run time...) and return reference to it..

     Dynamic Memory Allocation: -> Lef hand side (Student student) = Right hand side (new Student()); whatever in the left hand side of the equal to is happened at compile time
     and the right hand side of the equal to is happened at the runtime.
     */
}
// Student student = new Student(); here (Student) is the data type and (student) is the reference variable...
// Example: ArrayList<Integer> arrayList = new ArrayList<>(); Just like above here (Integer) is the data type..
class Student {
    // this are called the class data type... and class is used to define this data type..
    // inner class need to be static..
    int rollNumbers; // primitive data type
    float marks; // primitive data type
    String name;

    /*
    Constructor is defined what happens when object is created. Constructor is the special type of function in the class.
    It runs when we create an object and it allocates some variables.
     */
    Student(int rollNumbers, float marks, String name) {
        this.rollNumbers = rollNumbers;
        this.marks = marks;
        this.name = name;
    }
    // this is called by default constructor, created by jvm for us..
    Student() {

    }
}
