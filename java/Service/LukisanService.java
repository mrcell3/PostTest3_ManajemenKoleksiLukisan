package Service;

import Model.Lukisan;
import Model.LukisanDigital;
import java.util.ArrayList;
import java.util.Scanner;

public class LukisanService {
    private ArrayList<Lukisan> koleksi = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    private int inputAngka(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }
    
    public void tambahLukisanKlasik() {
        int id = inputAngka("Masukkan ID Lukisan: ");
        for (Lukisan l : koleksi) {
            if (l.getId() == id) {
                System.out.println("ID sudah digunakan!");
                return;
            }
        }

        System.out.print("Masukkan Judul Lukisan: ");
        String judul = input.nextLine();
        System.out.print("Masukkan Nama Pelukis: ");
        String pelukis = input.nextLine();
        int tahun = inputAngka("Masukkan Tahun: ");

        koleksi.add(new Lukisan(id, judul, pelukis, tahun));
        System.out.println("Lukisan berhasil ditambahkan!");
    }
    
    public void tambahLukisanDigital() {
        int id = inputAngka("Masukkan ID Lukisan Digital: ");
        for (Lukisan l : koleksi) {
            if (l.getId() == id) {
                System.out.println("ID sudah digunakan!");
                return;
            }
        }

        System.out.print("Masukkan Judul Lukisan: ");
        String judul = input.nextLine();
        System.out.print("Masukkan Nama Pelukis: ");
        String pelukis = input.nextLine();
        int tahun = inputAngka("Masukkan Tahun: ");
        System.out.print("Masukkan Software yang digunakan: ");
        String software = input.nextLine();

        koleksi.add(new LukisanDigital(id, judul, pelukis, tahun, software));
        System.out.println("Lukisan digital berhasil ditambahkan!");
    }
    
    public void lihatLukisan() {
        if (koleksi.isEmpty()) {
            System.out.println("Belum ada data lukisan.");
        } else {
            koleksi.forEach(System.out::println);
        }
    }
    
    public void updateLukisan() {
        int id = inputAngka("Masukkan ID lukisan yang akan diupdate: ");
        for (Lukisan l : koleksi) {
            if (l.getId() == id) {
                System.out.print("Masukkan Judul Baru: ");
                l.setJudul(input.nextLine());
                System.out.print("Masukkan Pelukis Baru: ");
                l.setPelukis(input.nextLine());
                l.setTahun(inputAngka("Masukkan Tahun Baru: "));
                System.out.println("Lukisan berhasil diupdate!");
                return;
            }
        }
        System.out.println("Lukisan dengan ID tersebut tidak ditemukan.");
    }
    
    public void hapusLukisan() {
        int id = inputAngka("Masukkan ID lukisan yang akan dihapus: ");
        if (koleksi.removeIf(l -> l.getId() == id)) {
            System.out.println("Lukisan berhasil dihapus!");
        } else {
            System.out.println("Lukisan dengan ID tersebut tidak ditemukan.");
        }
    }
    
    public void cariLukisan() {
        System.out.print("Masukkan kata kunci pencarian (judul/pelukis): ");
        String key = input.nextLine().toLowerCase();
        
        boolean ditemukan = false;
        for (Lukisan l : koleksi) {
        if (l.getJudul().toLowerCase().contains(key) ||
            l.getPelukis().toLowerCase().contains(key)) {
            System.out.println(l);
            ditemukan = true;
        }
    }    

    if (!ditemukan) {
        System.out.println("Tidak ada lukisan yang cocok dengan pencarian.");
        }
    }
}
        
