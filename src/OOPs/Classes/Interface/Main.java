package OOPs.Classes.Interface;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.playMusic();
        niceCar.stopMusic();

        niceCar.upgradeEngine();
        niceCar.start();
        niceCar.stop();
    }
}
