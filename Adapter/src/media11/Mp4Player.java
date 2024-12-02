package media11;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // No soportado
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo archivo MP4: " + fileName);
    }
}
