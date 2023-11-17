package OOPs.Classes.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I started like an Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("I stopped like an Electric engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerated like an Electric engine");
    }
}
