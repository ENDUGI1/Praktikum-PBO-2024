public class Alat extends Data{
    int stokAlat;


    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

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

    @Override
    public final void liat() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Harga: " + stokAlat);
    }
}

