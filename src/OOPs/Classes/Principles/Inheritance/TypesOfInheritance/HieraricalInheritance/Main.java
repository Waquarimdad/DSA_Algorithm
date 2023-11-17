package OOPs.Classes.Principles.Inheritance.TypesOfInheritance.HieraricalInheritance;

public class Main {
    public static void main(String[] args) {
        ChildClaasA childClaasA = new ChildClaasA();
        System.out.println("Height: " + childClaasA.height + ", Width: " + childClaasA.width + ", Breadth: " + childClaasA.breadth +
                ", Weight: " + childClaasA.weight);
        ChildClassB childClassB = new ChildClassB();
        System.out.println("Height: " + childClassB.height + ", Width: " + childClassB.width + ", Breadth: " + childClassB.breadth +
                ", Pieces: " + childClassB.pieces);
    }
}
