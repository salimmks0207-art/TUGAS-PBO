public class TokoBuah {
    private String nama;
    private int harga;
    private int stok;

    public TokoBuah(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getInfo() {
        return String.format("%-8s Rp %,d (stok:%d kg)", nama, harga, stok);
    }

    public boolean tersedia(int qty) {
        return qty <= stok;
    }

    public double hitungTotal(int qty) {
        stok -= qty;
        return (double) harga * qty;
    }
}