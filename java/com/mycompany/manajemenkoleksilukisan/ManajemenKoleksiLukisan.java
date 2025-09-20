package com.mycompany.manajemenkoleksilukisan;

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKoleksiLukisan {

    static class Lukisan {
        int id;
        String judul;
        String pelukis;
        int tahun;

        Lukisan(int id, String judul, String pelukis, int tahun) {
            this.id = id;
            this.judul = judul;
            this.pelukis = pelukis;
            this.tahun = tahun;
        }
    }

    public static void main (String[] args) {
        ArrayList<Lukisan> koleksi = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Manajemen Koleksi Lukisan ===");
            System.out.println("1. Tambah Lukisan");
            System.out.println("2. Lihat Daftar Lukisan");
            System.out.println("3. Update Lukisan");
            System.out.println("4. Hapus Lukisan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1:
                    // Tambah
                    System.out.print("Masukkan ID Lukisan: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Judul Lukisan: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Nama Pelukis: ");
                    String pelukis = input.nextLine();
                    System.out.print("Masukkan Tahun: ");
                    int tahun = input.nextInt();
                    input.nextLine();

                    koleksi.add(new Lukisan(id, judul, pelukis, tahun));
                    System.out.println("Lukisan berhasil ditambahkan!");
                    break;

                case 2:
                    // Lihat
                    System.out.println("\n=== Daftar Lukisan ===");
                    if (koleksi.isEmpty()) {
                        System.out.println("Belum ada data lukisan.");
                    } else {
                        for (Lukisan l : koleksi) {
                            System.out.println("ID: " + l.id +
                                               " | Judul: " + l.judul +
                                               " | Pelukis: " + l.pelukis +
                                               " | Tahun: " + l.tahun);
                        }
                    }
                    break;

                case 3:
                    // Update
                    System.out.print("Masukkan ID Lukisan yang akan diupdate: ");
                    int updateId = input.nextInt();
                    input.nextLine();
                    boolean ditemukan = false;

                    for (Lukisan l : koleksi) {
                        if (l.id == updateId) {
                            System.out.print("Masukkan Judul Baru: ");
                            l.judul = input.nextLine();
                            System.out.print("Masukkan Pelukis Baru: ");
                            l.pelukis = input.nextLine();
                            System.out.print("Masukkan Tahun Baru: ");
                            l.tahun = input.nextInt();
                            input.nextLine();
                            System.out.println("Data lukisan berhasil diupdate!");
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Lukisan dengan ID tersebut tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Hapus
                    System.out.print("Masukkan ID Lukisan yang akan dihapus: ");
                    int hapusId = input.nextInt();
                    input.nextLine();
                    boolean terhapus = false;

                    for (int i = 0; i < koleksi.size(); i++) {
                        if (koleksi.get(i).id == hapusId) {
                            koleksi.remove(i);
                            System.out.println("Lukisan berhasil dihapus!");
                            terhapus = true;
                            break;
                        }
                    }
                    if (!terhapus) {
                        System.out.println("Lukisan dengan ID tersebut tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Keluar
                    System.out.println("Program selesai. Terima kasih telah menggunakan sistem ini!");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        }
    }
}
