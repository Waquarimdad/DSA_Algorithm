package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.MultiLevelInheritance;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("Length: " + c.length + "," + "Breadth: " +  c.breadth + "," + "Height: " + c.height + ","
                + "Weight: " +  c.weight + "," + "Pieces: " + c.pieces);
        C newC = new C(
                1,
                2,
                3,
                4,
                5
        );
        System.out.println("Length: " + newC.length + "," + "Breadth: " +  newC.breadth + "," + "Height: " + newC.height + ","
                + "Weight: " +  newC.weight + "," + "Pieces: " + newC.pieces);
    }
}
