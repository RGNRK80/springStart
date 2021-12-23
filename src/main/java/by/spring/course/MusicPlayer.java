package by.spring.course;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList=new ArrayList<>();
    private  Music music;
    private String name;
    public  int volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setMusic(Music music) {
        this.music = music;
    }
    public MusicPlayer() {
    }

    public  MusicPlayer(Music music)
   { this.music=music;}

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList() {
        for (Music unit : musicList) {
            System.out.println("Playing: " + unit.getSong());
        }
    }

}
