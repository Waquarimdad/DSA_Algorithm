package OOPs.Classes.InterfaceExample;

public class DaoClassImpl implements DaoInterface{

    @Override
    public void start() {
        System.out.println("Starting, because I a an override method");
    }

    @Override
    public void end() {
        System.out.println("Ending, because I a an override method");
    }
}
