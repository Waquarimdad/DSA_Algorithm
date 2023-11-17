package Revision.Interface;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(5, "Diesel", 2);
        System.out.println(child);
        child.startEngine();
        Parent parent = new Child();
        parent.startEngine();
    }
}
