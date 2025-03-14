package com.iphone.model;

import com.iphone.model.interfaces.Browser;
import com.iphone.model.interfaces.MusicPlayer;
import com.iphone.model.interfaces.Phone;

public class Iphone implements Phone, MusicPlayer, Browser {

    @Override
    public void call() {
        System.out.println("Making a phone call.");
    }

    @Override
    public void answer() {
        System.out.println("Answering a phone call.");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Sending call to voice mail.");
    }

    @Override
    public void play(String music) {
        if(music.isEmpty()) {
            System.out.println("Playing random music.");
        } else {
            System.out.println(String.format("Playing selected music: %s", music));
        }
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void select(String music) {
        if(music.isEmpty()) {
            System.out.println("You must select a music.");
        } else {
            System.out.println("Selecting music \"" + music + "\"");
            play(music);
        }
    }

    @Override
    public void showPage() {
        System.out.println("Showing webpage.");
    }

    @Override
    public void newTab() {
        System.out.println("Opening a new tab.");
    }

    @Override
    public void reloadPage() {
        System.out.println("Reloading page.");
    }

}
