public class Alat extends Data{
    int stokAlat;

    public Alat(String nama, int harga, int stokAlat) {
        super(nama, harga);
        this.stokAlat = stokAlat;
    }

    public int getStokAlat() {
        return stokAlat;
    }

    public void setStokAlat(int stokAlat) {
        this.stokAlat = stokAlat;
    }

    void tampilAlat() {
        System.out.println("Nama Alat: " + nama);
        System.out.println("Harga Alat: " + harga);
        System.out.println("Stok Alat: " + stokAlat);
    }
}
