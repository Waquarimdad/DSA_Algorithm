package OOPs.Classes.Interface;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("This is a brake method");
    }

    @Override
    public void start() {
        System.out.println("This is a engine tart method");
    }

    @Override
    public void stop() {
        System.out.println("This is a engine stop method");
    }

    @Override
    public void accelerate() {
        System.out.println("This is a accelerate method");
    }
}
