package com.max.course;

public class ClasicalMusic implements Music {


    private ClasicalMusic(){}

    public static ClasicalMusic getnewObject(){
        return new ClasicalMusic();
    }
    public void initClassicalMusic(){
        System.out.println("Initialization of classical music");
    }

    public void destroy(){
        System.out.println("Destroying");
    }

    public String getString() {
        return "Classical";
    }
}
