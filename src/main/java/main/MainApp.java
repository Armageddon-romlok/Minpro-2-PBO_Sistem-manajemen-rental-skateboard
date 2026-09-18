/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.CruiserSkate;
import model.Skateboard;
import model.StreetSkate;
import service.SkateboardService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        SkateboardService service = new SkateboardService();
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n===============================");
            System.out.println("  SISTEM RENTAL SKATEBOARD ");
            System.out.println("===============================");
            System.out.println("1. Tampilkan Semua Skateboard");
            System.out.println("2. Tambah Skateboard Baru");
            System.out.println("3. Hapus Skateboard");
            System.out.println("4. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu (1-4): ");

            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println("\n=== DAFTAR KOLEKSI SKATEBOARD ===");
                        if (service.getDaftarSkateboard().isEmpty()) {
                            System.out.println("Belum ada data.");
                        } else {
                            for (Skateboard s : service.getDaftarSkateboard()) {
                                if (s instanceof StreetSkate) {
                                    ((StreetSkate) s).tampilkanInfoStreet();
                                } else if (s instanceof CruiserSkate) {
                                    ((CruiserSkate) s).tampilkanInfoCruiser();
                                }
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\n=== TAMBAH SKATEBOARD BARU ===");
                        System.out.println("1. Street Skate");
                        System.out.println("2. Cruiser Skate");
                        System.out.print("Pilih jenis (1-2): ");
                        int jenis = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Masukkan ID Skateboard : ");
                        String id = scanner.nextLine();
                        System.out.print("Masukkan Merk          : ");
                        String merk = scanner.nextLine();
                        System.out.print("Masukkan Harga Sewa    : ");
                        double harga = scanner.nextDouble();
                        scanner.nextLine();

                        if (jenis == 1) {
                            System.out.print("Masukkan Ukuran Roda   : ");
                            String roda = scanner.nextLine();
                            service.tambahSkateboard(new StreetSkate(id, merk, harga, roda));
                        } else if (jenis == 2) {
                            System.out.print("Masukkan Panjang Papan : ");
                            String panjang = scanner.nextLine();
                            service.tambahSkateboard(new CruiserSkate(id, merk, harga, panjang));
                        } else {
                            System.out.println(">> Pilihan jenis tidak valid!");
                        }
                        break;

                    case 3:
                        System.out.println("\n=== HAPUS SKATEBOARD ===");
                        System.out.print("Masukkan ID Skateboard yang dihapus: ");
                        String idHapus = scanner.nextLine();
                        
                        if (service.hapusSkateboard(idHapus)) {
                            System.out.println(">> Skateboard berhasil dihapus!");
                        } else {
                            System.out.println(">> ID Skateboard tidak ditemukan!");
                        }
                        break;

                    case 4:
                        berjalan = false;
                        System.out.println("\nProgram dihentikan secara aman. Terima kasih!");
                        break;

                    default:
                        System.out.println(">> Menu tidak tersedia. Pilih angka 1-4.");
                }

            // Menangkap error jika user memasukkan huruf saat diminta angka
            } catch (InputMismatchException e) {
                System.out.println(">> ERROR CRASH DICEGAH: Input harus berupa angka!");
                scanner.nextLine(); // Buang input huruf yang nyangkut di buffer
            }
        }
        scanner.close();
    }
}