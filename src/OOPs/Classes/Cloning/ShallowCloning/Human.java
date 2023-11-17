package OOPs.Classes.Cloning.ShallowCloning;

import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] array;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.array = new int[]{1,2,3,4,5,6,7,8,9};
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // Shallow cloning
        return super.clone();
    }
}
