package Model;

public class LukisanDigital extends Lukisan{
    private String software;
    
    public LukisanDigital(int id, String judul, String pelukis, int tahun, String software) {
        super(id, judul, pelukis, tahun);
        this.software = software;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }
    
     @Override
    public String toString() {
        return super.toString() + " | Software: " + software;
    }    
}
