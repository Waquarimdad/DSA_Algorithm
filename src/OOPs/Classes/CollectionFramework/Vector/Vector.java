package OOPs.Classes.CollectionFramework.Vector;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
        List<Integer> marks = new java.util.Vector<>();
        for (int i = 0; i < 6; i++) {
            marks.add(i);
        }
        System.out.println(marks);
    }
}
