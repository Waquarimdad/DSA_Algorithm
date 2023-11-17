import Revision.Interface.Parent;

import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5};
        System.out.println(returnEvenCount(array));
    }
    static int returnEvenCount(int[] array) {
        int i = 0;
        int count = 0;
        while (i < array.length) {
            if (array[i] % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
