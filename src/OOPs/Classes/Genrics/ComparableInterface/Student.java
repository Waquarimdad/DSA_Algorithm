package OOPs.Classes.Genrics.ComparableInterface;

public class Student implements Comparable<Student>{
    int rollNumber;
    float marks;

    Student(int rollNumber, float marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.marks - o.marks);
        /*
            if diff == 0: means both are equal
            if diff < 0: means o is bigger else o is smaller
         */
    }
}
