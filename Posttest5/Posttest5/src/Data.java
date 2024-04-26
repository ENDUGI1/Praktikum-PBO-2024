public abstract class Data {
    String nama;
    int harga;

    public Data(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public abstract void setNama(String nama) ;
        
    

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void liat() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }
}
