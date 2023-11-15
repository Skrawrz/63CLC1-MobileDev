package com.nguyenphuocbaokhoa.a63130584_thigiuaky;

public class Music {
    private String musicName;
    private String musicImg;
    private String musician;

    public Music(String musicName, String musicImg, String musician) {
        this.musicName = musicName;
        this.musicImg = musicImg;
        this.musician = musician;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicImg() {
        return musicImg;
    }

    public void setMusicImg(String musicImg) {
        this.musicImg = musicImg;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }
}
