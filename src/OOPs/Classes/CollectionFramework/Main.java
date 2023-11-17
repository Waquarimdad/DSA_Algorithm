package OOPs.Classes.CollectionFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            Here Child interface is the parent and ArrayList is the child class.
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> marks = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
           marks.add(i);
        }
        System.out.println(marks);
    }
}
