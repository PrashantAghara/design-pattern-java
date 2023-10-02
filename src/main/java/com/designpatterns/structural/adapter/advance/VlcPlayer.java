package com.designpatterns.structural.adapter.advance;

import com.designpatterns.structural.adapter.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC with file name : " + fileName);
    }
}
