package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.advance.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advanceMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advanceMediaPlayer.playVlc(fileName);
        }
    }
}
