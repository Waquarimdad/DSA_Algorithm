package OOPs.Classes.AccessControl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A object = new A();
         /*
            Need to do few things
            1. Access the data members
            2. Modify the data members
         */
        object.setName("Salman Khan");
        object.setArray(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(object.getArray()));
        System.out.println(object.getName());
    }
}
