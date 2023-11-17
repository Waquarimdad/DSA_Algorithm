package OOPs.Classes.ImportantPointInJava;

public class GetClassMethod {

}
class Child extends GetClassMethod {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getClass());
    }
}
