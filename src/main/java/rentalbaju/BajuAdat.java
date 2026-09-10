package rentalbaju;

public class BajuAdat {
    // Access modifier private (Encapsulation)
    private String idBaju;
    private String namaBaju;
    private String asalDaerah;
    private double hargaSewa;

    // Constructor
    public BajuAdat(String idBaju, String namaBaju, String asalDaerah, double hargaSewa) {
        this.idBaju = idBaju;
        this.namaBaju = namaBaju;
        this.asalDaerah = asalDaerah;
        this.hargaSewa = hargaSewa;
    }

    // Getter dan Setter (Encapsulation)
    public String getIdBaju() {
        return idBaju;
    }

    public void setIdBaju(String idBaju) {
        this.idBaju = idBaju;
    }

    public String getNamaBaju() {
        return namaBaju;
    }

    public void setNamaBaju(String namaBaju) {
        this.namaBaju = namaBaju;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
}