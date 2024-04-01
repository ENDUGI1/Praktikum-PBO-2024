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

    @Override
    public void liat() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Harga: " + stokAlat);
    }
}

