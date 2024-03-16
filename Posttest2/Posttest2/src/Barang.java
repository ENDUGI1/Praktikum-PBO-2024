class Barang {
    private String nama;
    private String jenisBarang;
    private int harga;
    private int stok;

    public Barang(String nama, String jenisBarang, int harga, int stok) {
        this.nama = nama;
        this.jenisBarang = jenisBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Barang: " + jenisBarang);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}