package OOPs.Classes.CollectionFramework.Enumerations;

public enum EnumExample implements A{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    @Override
    public void message() {
        System.out.println("This is nice");
    }
}
