package OOPs.Classes.Cloning.DeepCloaning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] array;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.array = new int[]{1,2,3,4,5,6,7,8,9};
    }
    /*
        Deep cloning
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();
        twin.array = new int[twin.array.length];
        for (int i = 0; i < twin.array.length; i++) {
            twin.array[i] = this.array[i];
        }
        return twin;
    }
}
