package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.SingleInheritance;

public class Main {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println("Height: " + childClass.height + "," + "Width: " + childClass.width + "," + "Breadth: "
                + childClass.breadth + "," +  "Weight: " + childClass.weight);
        ChildClass childClassInheritParent = new ChildClass(
                1,
                2,
                3,
                4
        );
        System.out.println("Height: " + childClassInheritParent.height + "," + "Width: " + childClassInheritParent.width + "," + "Breadth: "
                + childClassInheritParent.breadth + "," +  "Weight: " + childClassInheritParent.weight);
    }
}
