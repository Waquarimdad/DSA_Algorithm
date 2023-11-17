package OOPs.Classes.ImportantPointInJava;

public class ParentClass {
    /*
        This is very important concept..

     */
}
class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        boolean isInstanceOf = obj instanceof Object;
        System.out.println(isInstanceOf);
    }
}
