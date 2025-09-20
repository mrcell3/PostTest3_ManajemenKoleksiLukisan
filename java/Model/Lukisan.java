package Model;

public class Lukisan {
    protected int id;
    protected String judul;
    protected String pelukis;
    protected int tahun;
    
    public Lukisan(int id, String judul, String pelukis, int tahun) {
        this.id = id;
        this.judul = judul;
        this.pelukis = pelukis;
        this.tahun = tahun;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPelukis() {
        return pelukis;
    }

    public void setPelukis(String pelukis) {
        this.pelukis = pelukis;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Judul: " + judul +
               " | Pelukis: " + pelukis +
               " | Tahun: " + tahun;
    }
}
