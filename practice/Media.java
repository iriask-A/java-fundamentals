package practice;

import java.util.Vector;
public class Media {
    private String title;
    public Media(String title){
        this.title = title;
    }
    public String play(){
        return "Playing media";
    }

    public static void main(String[] args) {
        Vector<Media> v = new Vector<>();
        v.add(new Song("AAAA","Me"));
        v.add(new Movie("BBB",30));

        for(Media item: v){
            item.play();
            if(item instanceof Song){
                Song s = (Song) item;
                System.out.println(s.getArtist());

            }
        }
    }
}
class Song extends Media{
    private String artist;
    public Song(String title,String artist){
        super(title);
        this.artist = artist;

    }
    @Override
    public String play(){
        return artist+ "Playing";
    }
    public String getArtist(){
        return artist;
    }
}
class Movie extends Media{
    private int duration;
    public Movie(String title,int duration){
        super(title);
        this.duration = duration;
    }
    public String play(){
        return "duration is"+duration;
    }
}

