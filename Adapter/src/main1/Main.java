package main1;

import media11.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cancion.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "pelicula.vlc");
        audioPlayer.play("avi", "archivo.avi");
    }
}
