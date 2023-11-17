package OOPs.Classes.Interface;

public class MediaPlayer implements Media {
    @Override
    public void start() {
        System.out.println("I stopped like a media player");
    }

    @Override
    public void stop() {
        System.out.println("I started like a media player");
    }
}
