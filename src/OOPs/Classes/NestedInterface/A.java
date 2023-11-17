package OOPs.Classes.NestedInterface;

public class A {
    // nested interface
    public interface nestedInterface {
        boolean isEven(int value);
    }
}
class B implements A.nestedInterface {

    @Override
    public boolean isEven(int value) {
        return (value % 2 == 0);
    }
}
