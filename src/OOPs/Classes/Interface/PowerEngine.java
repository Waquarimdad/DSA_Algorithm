package OOPs.Classes.Interface;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I started like an Power engine");
    }

    @Override
    public void stop() {
        System.out.println("I stopped like an Power engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like an Power engine");
    }
}
