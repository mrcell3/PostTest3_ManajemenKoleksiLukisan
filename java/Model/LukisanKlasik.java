package Model;

public class LukisanKlasik extends Lukisan {
    private String media;

    public LukisanKlasik(int id, String judul, String pelukis, int tahun, String media) {
        super(id, judul, pelukis, tahun);
        this.media = media;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Media: " + media;
    }
}
