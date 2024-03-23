public class Bahan extends Data {
    String merkBahan;
    int stokBahan;

    public Bahan(String nama, String merkBahan,int harga, int stokBahan) {
        super(nama, harga);
        this.merkBahan = merkBahan;
        this.stokBahan = stokBahan;
    }

    public String getMerkBahan() {
        return merkBahan;
    }

    public void setMerkBahan( String merkBahan) {
        this.merkBahan = merkBahan;
    }

    public int getStokBahan() {
        return stokBahan;
    }

    public void setStokBahan(int stokBahan) {
        this.stokBahan = stokBahan;
    }

    void tampilBahan() {
        System.out.println("Nama Bahan: " + nama);
        System.out.println("Merk Bahan: " + merkBahan);
        System.out.println("Harga Bahan: " + harga);
        System.out.println("Stok Bahan: " + stokBahan);
    }
}