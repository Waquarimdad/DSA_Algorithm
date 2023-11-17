package OOPs.Classes.CollectionFramework.Enumerations;

public class Main {
    public static void main(String[] args) {
        EnumExample enumExample;
        enumExample = EnumExample.Monday;
        System.out.println(enumExample);

        for(EnumExample week: EnumExample.values()) {
            System.out.print(week + " ");
        }
        System.out.println();
        enumExample.message();
    }
}
