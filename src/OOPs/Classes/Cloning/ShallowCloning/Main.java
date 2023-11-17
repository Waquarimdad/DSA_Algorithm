package OOPs.Classes.Cloning.ShallowCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(34, "Kunal Kushwaha");

        try {
            Human clone = (Human) kunal.clone();
            System.out.println(clone.age + " " + clone.name);
            clone.array[0] = 100;
            System.out.println(Arrays.toString(clone.array));
            /*
                Shallow cloning
             */
            System.out.println(Arrays.toString(kunal.array));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
