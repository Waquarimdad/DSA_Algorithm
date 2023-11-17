package OOPs.Classes.Interface;

public class NiceCar {
    private  Engine engine;

    private final MediaPlayer mediaPlayer;

    NiceCar() {
        engine = new PowerEngine();
        mediaPlayer = new MediaPlayer();
    }

    void start() {
        engine.start();
    }

    void stop() {
        engine.stop();
    }

    void stopMusic() {
        mediaPlayer.stop();
    }
    void playMusic() {
        mediaPlayer.start();
    }

    void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
