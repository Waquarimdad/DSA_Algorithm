package OOPs.Classes.Packages.TypeOfPackages.InBuilt;
import java.lang.*;

public class ObjectExample {
    int number;

    public ObjectExample(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        /*
            Unique representation of an object using random number.
            Misconception: Hashcode is not the address of an object, but it's an random integer value.
         */
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ObjectExample{" +
                "number=" + number +
                '}';
    }

    public static void main(String[] args) {
        ObjectExample objectExample = new ObjectExample(123);
        System.out.println(objectExample.hashCode());
        ObjectExample obj = new ObjectExample(34);
        System.out.println(obj.hashCode());

        String name = new String("kunal");
        String anotherName = new String("kunal");
        boolean isEqual = name.equals(anotherName);
        System.out.println(isEqual);
    }
}