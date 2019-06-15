package com.max.course;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.ArrayList;

public class MusicPlayer {
//    @Autowired
//    private List<Music> music = new ArrayList<Music>();
    private Music music;
    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

//    public MusicPlayer() {
//    }

//    public void setMusic(List<Music> music) {
//        this.music = music;
//    }

    public void playMusic(){
//        for (Music music1: music)
//        System.out.println("Playing " + music1.getString());
        System.out.println("Playing " + music.getString());
    }
}
