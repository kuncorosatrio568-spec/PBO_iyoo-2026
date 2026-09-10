package rentalbaju;

public class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private BajuAdat baju;
    private int lamaSewa; // dalam hari

    // Constructor
    public Transaksi(String idTransaksi, Pelanggan pelanggan, BajuAdat baju, int lamaSewa) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.baju = baju;
        this.lamaSewa = lamaSewa;
    }

    // Method menghitung total biaya sewa
    public double hitungTotalBiaya() {
        return baju.getHargaSewa() * lamaSewa;
    }

    // Getter dan Setter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public BajuAdat getBaju() {
        return baju;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
}