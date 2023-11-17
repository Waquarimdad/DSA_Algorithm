package OOPs.Classes.Cloning.DeepCloaning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(34, "Kunal Kushwaha");

        try {
            Human clone = (Human) kunal.clone();
            clone.array[0] = 100;
            System.out.println(Arrays.toString(clone.array));
            System.out.println(Arrays.toString(kunal.array));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
