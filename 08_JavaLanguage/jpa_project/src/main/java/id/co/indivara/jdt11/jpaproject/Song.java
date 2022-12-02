package id.co.indivara.jdt11.jpaproject;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="song")

public class Song {
    @Id
    @Column(name="songId")
    private int songId ;

    @Column(name="songName")
    private String songName ;

    @Column(name="singer")
    private String singer;

    public void setSongId(int songId){
        this.songId = songId;
    }
    public int getSongId(){
        return this.songId;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }
    public String getSongName(){
        return this.songName;
    }

    public void setSinger(String singer){
        this.singer = singer;
    }
    public String getSinger(){
        return this.singer;
    }
}