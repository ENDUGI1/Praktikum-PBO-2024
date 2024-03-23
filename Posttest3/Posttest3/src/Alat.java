public class Alat extends Data{
    String merkAlat;
    int stokAlat;

    public Alat(String nama, String merkAlat,int harga, int stokAlat) {
        super(nama, harga);
        this.merkAlat = merkAlat;
        this.stokAlat = stokAlat;
    }

    public String getMerkAlat() {
        return merkAlat;
    }

    public void setMerkAlat(String merkAlat) {
        this.merkAlat = merkAlat;
    }

    public int getStokAlat() {
        return stokAlat;
    }

    public void setStokAlat(int stokAlat) {
        this.stokAlat = stokAlat;
    }

    void tampilAlat() {
        System.out.println("Nama Alat: " + nama);
        System.out.println("Merk Alat: " + merkAlat);
        System.out.println("Harga Alat: " + harga);
        System.out.println("Stok Alat: " + stokAlat);
    }
}
