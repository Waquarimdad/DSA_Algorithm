package OOPs.Classes.Genrics.ComparableInterface;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student salman  = new Student(1, 79.99f);
        Student aamir  = new Student(2, 99.99f);
        Student amitabh  = new Student(3, 94.99f);
        Student alan  = new Student(4, 87.99f);
        Student walker  = new Student(5, 78.99f);

        Student[] list = {salman, aamir, amitabh, alan, walker};
        /*
            here we are not using arrays list but we are using Student objects, so we need to create our own toString method in the class to
            override it.
         */
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int) (o1.marks - o2.marks);
            }
        });
        /*
             We can achieve above with the help of lambda function in just few lines.
             Lambda expression is very much important.
         */

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));
        /*
            here we are not using Student objects, so we don't need to create our own toString method in the class.
         */
        System.out.println(Arrays.toString(list));
        String[] student = {"salman", "aamir", "rohit","virat"};
        System.out.println(Arrays.toString(student));
    }
}
