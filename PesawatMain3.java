package Praktikum170425;

import java.util.Scanner;

public class PesawatMain3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pesawat[] daftarPesawat = null;
        int jumlah = 0;
        boolean dataDiisi = false;
        int pilihan;

        do {
            System.out.println("\n=== MENU PESAWAT ===");
            System.out.println("1. Input Data Pesawat");
            System.out.println("2. Tampilkan Semua Data Pesawat");
            System.out.println("3. Tampilkan Pesawat dengan Muatan Terbesar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();
            in.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah pesawat: ");
                    jumlah = in.nextInt();
                    in.nextLine();

                    daftarPesawat = new Pesawat[jumlah];

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nInput data pesawat ke-" + (i + 1));
                        System.out.print("Nama pesawat: ");
                        String nama = in.nextLine();
                        System.out.print("Tahun produksi: ");
                        int tahunProduksi = in.nextInt();
                        System.out.print("Menggunakan mesin? (true/false): ");
                        boolean mesin = in.nextBoolean();
                        System.out.print("Jumlah maksimum penumpang: ");
                        int muatan = in.nextInt();
                        in.nextLine(); // Buang newline

                        daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
                    }
                    dataDiisi = true;
                    break;

                case 2:
                    if (!dataDiisi) {
                        System.out.println("Data pesawat belum diinput!");
                        break;
                    }
                    System.out.println("\n--- DAFTAR PESAWAT ---");
                    for (int i = 0; i < daftarPesawat.length; i++) {
                        System.out.println("\nData pesawat ke-" + (i + 1) + ":");
                        daftarPesawat[i].Cetak();
                    }
                    break;

                case 3:
                    if (!dataDiisi) {
                        System.out.println("Data pesawat belum diinput!");
                        break;
                    }

                    int max = daftarPesawat[0].getMuatan();
                    String namaMax = daftarPesawat[0].getNama();

                    for (int i = 1; i < daftarPesawat.length; i++) {
                        if (daftarPesawat[i].getMuatan() > max) {
                            max = daftarPesawat[i].getMuatan();
                            namaMax = daftarPesawat[i].getNama();
                        }
                    }

                    System.out.println("\nPesawat dengan kapasitas penumpang terbesar:");
                    System.out.println("Nama Pesawat: " + namaMax);
                    System.out.println("Jumlah maksimum penumpang: " + max);
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);
    }
}
