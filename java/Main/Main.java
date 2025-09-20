package Main;

import Service.LukisanService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LukisanService service = new LukisanService();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Manajemen Koleksi Lukisan ===");
            System.out.println("1. Tambah Lukisan");
            System.out.println("2. Lihat Daftar Lukisan");
            System.out.println("3. Update Lukisan");
            System.out.println("4. Hapus Lukisan");
            System.out.println("5. Cari Lukisan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            String pilih = input.nextLine();
            switch (pilih) {
                case "1":
                    System.out.println("\n--- Pilih Jenis Lukisan ---");
                    System.out.println("1. Lukisan Klasik");
                    System.out.println("2. Lukisan Digital");
                    System.out.print("Pilih jenis: ");
                    String jenis = input.nextLine();

                    switch (jenis) {
                        case "1":
                            service.tambahLukisanKlasik();
                            break;
                        case "2":
                            service.tambahLukisanDigital();
                            break;
                        default:
                            System.out.println("Jenis lukisan tidak valid!");
                    }
                    break;
                case "2":
                    service.lihatLukisan();
                    break;
                case "3":
                    service.updateLukisan();
                    break;
                case "4":
                    service.hapusLukisan();
                    break;
                case "5":
                    service.cariLukisan();
                    break;
                case "6":
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        }
    }
}
