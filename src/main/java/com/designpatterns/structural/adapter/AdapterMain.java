package com.designpatterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("VLC", "music.vlc");
        audioPlayer.play("mp3", "music.mp3");
        audioPlayer.play("exe","game.exe");
    }
}
