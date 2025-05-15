package $04class;

import java.util.Date;

public class Song {
    private String title;       // 노래제목
    private String artist;      // 가수
    private String album;       // 앨범제목
    private String composer;    // 작곡가
    private String year;          // 발표된 연도
    private int track;          // 앨범 번호

    public Song(String title, String artist, String album, String composer, String year, int track){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getComposer() {
        return this.composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTrack() {
        return this.track;
    }

    public void setTrack(int track) {
        this.track = track;
    }
    
    public void show(){
        System.out.printf("노래제목: %s, 가수: %s, 앨범제목: %s, 작곡가: %s, 노래가 발표한 연도: %s, 트랙 번호: %s", title, artist, album, composer, year, track);
    }
}
