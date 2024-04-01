import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class App {
    public static void main(String[] args) {
        ArrayList<Bahan> dataBahan = new ArrayList<>();
        ArrayList<Alat> dataAlat = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilih = 0;

        while (pilih != 5) {
            // output pilihan
            System.out.println("==================================");
            System.out.println("           MENU TOKO BANGUNAN           ");
            System.out.println("==================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.println("==================================");
            System.out.print("Masukkan Pilihan: ");

            // agar saat inputan bukan angka tidak error
            try {
                pilih = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.nextLine(); // Membuang karakter newline
                continue;
            }

            switch (pilih) {
                case 1:
                    System.out.println("\n1. Tambah Alat");
                    System.out.println("2. Tambah Bahan");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihTambah = sc.nextInt();
                    sc.nextLine(); // Membuang karakter newline

                    if (pilihTambah == 1) {
                        System.out.println("\nMasukkan Nama Alat");
                        String namaAlat = sc.nextLine();
                        System.out.println("Masukkan Harga");
                        int hargaAlat = sc.nextInt();
                        System.out.println("Masukkan Stok");
                        int stokAlat = sc.nextInt();
                        Alat alatBaru = new Alat(namaAlat, hargaAlat, stokAlat);
                        dataAlat.add(alatBaru);
                        System.out.println("\nData alat berhasil ditambahkan!");
                    } else if (pilihTambah == 2) {
                        System.out.println("\nMasukkan Nama Bahan");
                        String namaBahan = sc.nextLine();
                        System.out.println("Masukkan Merk Bahan");
                        String merkBahan = sc.nextLine();
                        System.out.println("Masukkan Harga");
                        int hargaBahan = sc.nextInt();
                        System.out.println("Masukkan Stok");
                        int stokBahan = sc.nextInt();
                        Bahan bahanBaru = new Bahan(namaBahan, merkBahan, hargaBahan, stokBahan);
                        dataBahan.add(bahanBaru);
                        System.out.println("\nData bahan berhasil ditambahkan!");
                    } else {
                        System.out.println("\nPilihan tidak valid!");
                    }
                    break;

                    case 2:
                    System.out.println("\n1. Tampil Alat");
                    System.out.println("2. Tampil Bahan");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihTampil = sc.nextInt();
                    sc.nextLine(); // Membuang karakter newline
        
                    if (pilihTampil == 1) {
                        System.out.println("\n==================================");
                        System.out.println("           DATA ALAT           ");
                        System.out.println("==================================");
                        for (int i = 0; i < dataAlat.size(); i++) {
                            dataAlat.get(i).liat();
                            System.out.println("==================================");
                        }
                        
                    } else if (pilihTampil == 2) {
                        System.out.println("\n==================================");
                        System.out.println("           DATA BAHAN           ");
                        System.out.println("==================================");
                        System.out.println("1. Tampilkan semua data bahan");
                        System.out.println("2. Tampilkan hanya nama dan merk bahan");
                        System.out.print("Masukkan Pilihan: ");
                        int pilihTampilBahan = sc.nextInt();
                        sc.nextLine(); // Membuang karakter newline
                        
                        if (pilihTampilBahan == 1) {
                            for (int i = 0; i < dataBahan.size(); i++) {
                                dataBahan.get(i).tampilBahan("Ini Adalah Data Bahan Yang Lengkap");
                                System.out.println("==================================");
                            }
                        } else if (pilihTampilBahan == 2) {
                            for (int i = 0; i < dataBahan.size(); i++) {
                                dataBahan.get(i).tampilBahan(2);
                                System.out.println("==================================");
                            }
                        } else {
                            System.out.println("\nPilihan tidak valid!");
                        }
                    } else {
                        System.out.println("\nPilihan tidak valid!");
                    }
                    break;

                case 3:
                    if (dataBahan.size() == 0 && dataAlat.size() == 0) {
                        System.out.println("\nTidak ada data yang dapat diubah!");
                        break;
                    }
                    System.out.println("\n1. Ubah Alat");
                    System.out.println("2. Ubah Bahan");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihUbah = sc.nextInt();
                    sc.nextLine(); // Membuang karakter newline

                    if (pilihUbah == 1) {
                        if (dataAlat.size() == 0) {
                            System.out.println("\nTidak ada data alat yang dapat diubah!");
                            break;
                        }
                        System.out.println("\n==================================");
                        System.out.println("           DATA ALAT           ");
                        System.out.println("==================================");
                        for (int i = 0; i < dataAlat.size(); i++) {
                            System.out.println("Alat ke-" + (i + 1));
                            dataAlat.get(i).liat();
                            System.out.println("==================================");
                        }
                        System.out.println("\nUbah data ke berapa");
                        int ubahAlat = sc.nextInt();
                        sc.nextLine();

                        if (ubahAlat < 1 || ubahAlat > dataAlat.size()) {
                            System.out.println("\nData alat tidak ditemukan!");
                            break;
                        }

                        System.out.println("Masukkan Nama Alat Baru");
                        dataAlat.get(ubahAlat - 1).setNama(sc.nextLine());

                        System.out.println("Masukkan Harga Baru");
                        dataAlat.get(ubahAlat - 1).setHarga(sc.nextInt());

                        System.out.println("Masukkan Stok Alat Baru");
                        dataAlat.get(ubahAlat - 1).setStokAlat(sc.nextInt());
                        System.out.println("\nData alat berhasil diubah!");
                    } else if (pilihUbah == 2) {
                        if (dataBahan.size() == 0) {
                            System.out.println("\nTidak ada data bahan yang dapat diubah!");
                            break;
                        }
                        System.out.println("\n==================================");
                        System.out.println("           DATA BAHAN           ");
                        System.out.println("==================================");
                        for (int i = 0; i < dataBahan.size(); i++) {
                            System.out.println("Bahan ke-" + (i + 1));
                            dataBahan.get(i).tampilBahan("Ini Adalah Data Bahan Yang Lengkap");
                            System.out.println("==================================");
                        }
                        System.out.println("\nUbah data ke berapa");
                        int ubahBahan = sc.nextInt();
                        sc.nextLine();

                        if (ubahBahan < 1 || ubahBahan > dataBahan.size()) {
                            System.out.println("\nData bahan tidak ditemukan!");
                            break;
                        }

                        System.out.println("Masukkan Nama Bahan Baru");
                        dataBahan.get(ubahBahan - 1).setNama(sc.nextLine());

                        System.out.println("Masukkan Merk Bahan Baru");
                        dataBahan.get(ubahBahan - 1).setMerkBahan(sc.nextLine());

                        System.out.println("Masukkan Harga Baru");
                        dataBahan.get(ubahBahan - 1).setHarga(sc.nextInt());

                        System.out.println("Masukkan Stok Baru");
                        dataBahan.get(ubahBahan - 1).setStokBahan(sc.nextInt());
                        System.out.println("\nData bahan berhasil diubah!");
                    } else {
                        System.out.println("\nPilihan tidak valid!");
                    }
                    break;

                case 4:
                    if (dataBahan.size() == 0 && dataAlat.size() == 0) {
                        System.out.println("\nTidak ada data yang dapat dihapus!");
                        break;
                    }
                    System.out.println("\n1. Hapus Alat");
                    System.out.println("2. Hapus Bahan");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihHapus = sc.nextInt();
                    sc.nextLine(); // Membuang karakter newline

                    if (pilihHapus == 1) {
                        if (dataAlat.size() == 0) {
                            System.out.println("\nTidak ada data alat yang dapat dihapus!");
                            break;
                        }
                        System.out.println("\n==================================");
                        System.out.println("           DATA ALAT           ");
                        System.out.println("==================================");
                        for (int i = 0; i < dataAlat.size(); i++) {
                            System.out.println("Alat ke-" + (i + 1));
                            dataAlat.get(i).liat();
                            System.out.println("==================================");
                        }
                        System.out.println("\nHapus data ke berapa");
                        int hapusAlat = sc.nextInt();

                        if (hapusAlat < 1 || hapusAlat > dataAlat.size()) {
                            System.out.println("\nData alat tidak ditemukan!");
                            break;
                        }

                        dataAlat.remove(hapusAlat - 1);
                        System.out.println("\nData alat berhasil dihapus!");
                    } else if (pilihHapus == 2) {
                        if (dataBahan.size() == 0) {
                            System.out.println("\nTidak ada data bahan yang dapat dihapus!");
                            break;
                        }
                        System.out.println("\n==================================");
                        System.out.println("           DATA BAHAN           ");
                        System.out.println("==================================");
                        for (int i = 0; i < dataBahan.size(); i++) {
                            System.out.println("Bahan ke-" + (i + 1));
                            dataBahan.get(i).tampilBahan("Ini Adalah Data Bahan Yang Lengkap");
                            System.out.println("==================================");
                        }
                        System.out.println("\nHapus data ke berapa");
                        int hapusBahan = sc.nextInt();

                        if (hapusBahan < 1 || hapusBahan > dataBahan.size()) {
                            System.out.println("\nData bahan tidak ditemukan!");
                            break;
                        }

                        dataBahan.remove(hapusBahan - 1);
                        System.out.println("\nData bahan berhasil dihapus!");
                    } else {
                        System.out.println("\nPilihan tidak valid!");
                    }
                    break;

                default:
                    break;
            }
        }
    }
}

