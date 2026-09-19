/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.CruiserSkate;
import model.Penyewa;
import model.Skateboard;
import model.StreetSkate;
import service.SkateboardService;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SkateboardService service = new SkateboardService();
        boolean running = true;

        while (running) {
            System.out.println("\n=========================================");
            System.out.println("  SISTEM MANAJEMEN RENTAL SKATEBOARD");
            System.out.println("=========================================");
            System.out.println("1. Tambah Data Rental (Create)");
            System.out.println("2. Tampilkan Data Rental (Read)");
            System.out.println("3. Update Lama Sewa (Update)");
            System.out.println("4. Hapus Data Rental (Delete)");
            System.out.println("5. Keluar");
            System.out.println("=========================================");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer enter
            } catch (InputMismatchException e) {
                System.out.println(">> ERROR: Masukan harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== TAMBAH DATA RENTAL ===");
                    System.out.print("Masukkan ID Rental (misal: RNT-03): ");
                    String idRental = scanner.nextLine();

                    if (service.isIdRentalAda(idRental)) {
                        System.out.println(">> ERROR: ID Rental sudah terdaftar! Gunakan ID lain.");
                        break;
                    }

                    System.out.print("Masukkan Nama Penyewa           : ");
                    String nama = scanner.nextLine();

                    int lamaSewa = 0;
                    try {
                        System.out.print("Masukkan Lama Sewa (Hari)       : ");
                        lamaSewa = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(">> ERROR: Lama sewa harus berupa angka bulat!");
                        scanner.nextLine();
                        break;
                    }

                    System.out.println("\nPilih Jenis Skateboard:");
                    System.out.println("1. Street Skate");
                    System.out.println("2. Cruiser Skate");
                    System.out.print("Pilihan (1-2): ");
                    int jenis = 0;
                    try {
                        jenis = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(">> ERROR: Pilihan jenis harus berupa angka!");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Masukkan ID Papan               : ");
                    String idPapan = scanner.nextLine();
                    System.out.print("Masukkan Merk Papan             : ");
                    String merk = scanner.nextLine();

                    double tarif = 0;
                    try {
                        System.out.print("Masukkan Tarif Sewa per Hari    : ");
                        tarif = scanner.nextDouble();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(">> ERROR: Tarif harus berupa angka!");
                        scanner.nextLine();
                        break;
                    }

                    Skateboard papanDipilih = null;
                    if (jenis == 1) {
                        System.out.print("Masukkan Ukuran Roda (misal: 52mm): ");
                        String roda = scanner.nextLine();
                        papanDipilih = new StreetSkate(idPapan, merk, tarif, roda);
                    } else if (jenis == 2) {
                        System.out.print("Masukkan Panjang Papan (misal: 28 inch): ");
                        String panjang = scanner.nextLine();
                        papanDipilih = new CruiserSkate(idPapan, merk, tarif, panjang);
                    } else {
                        System.out.println(">> ERROR: Jenis skateboard tidak valid!");
                        break;
                    }

                    service.tambahRental(new Penyewa(idRental, nama, lamaSewa, papanDipilih));
                    System.out.println(">> Data rental berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR TRANSAKSI RENTAL SKATEBOARD ===");
                    if (service.getDaftarRental().isEmpty()) {
                        System.out.println("Belum ada data rental yang tersimpan.");
                    } else {
                        for (Penyewa p : service.getDaftarRental()) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("ID Rental     : " + p.getIdRental());
                            System.out.println("Penyewa       : " + p.getNamaPenyewa());
                            System.out.println("Lama Sewa     : " + p.getLamaSewa() + " Hari");
                            
                            // Menampilkan detail spesifik berdasarkan subclass
                            if (p.getSkateboard() instanceof StreetSkate) {
                                ((StreetSkate) p.getSkateboard()).tampilkanDetailStreet();
                            } else if (p.getSkateboard() instanceof CruiserSkate) {
                                ((CruiserSkate) p.getSkateboard()).tampilkanDetailCruiser();
                            }

                            System.out.println("TOTAL BIAYA   : Rp " + p.hitungTotalBiaya());
                            System.out.println("--------------------------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== UPDATE LAMA SEWA ===");
                    System.out.print("Masukkan ID Rental yang ingin diupdate: ");
                    String idUpdate = scanner.nextLine();

                    int lamaBaru = 0;
                    try {
                        System.out.print("Masukkan Lama Sewa yang Baru (Hari) : ");
                        lamaBaru = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(">> ERROR: Lama sewa harus berupa angka bulat!");
                        scanner.nextLine();
                        break;
                    }

                    if (service.updateLamaSewa(idUpdate, lamaBaru)) {
                        System.out.println(">> Lama sewa berhasil diupdate!");
                    } else {
                        System.out.println(">> ERROR: Data dengan ID Rental tersebut tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== HAPUS DATA RENTAL ===");
                    System.out.print("Masukkan ID Rental yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();

                    if (service.hapusRental(idHapus)) {
                        System.out.println(">> Data rental berhasil dihapus!");
                    } else {
                        System.out.println(">> ERROR: Data dengan ID Rental tersebut tidak ditemukan.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("\nProgram dihentikan secara aman. Terima kasih!");
                    break;

                default:
                    System.out.println(">> Pilihan tidak tersedia. Silakan pilih 1-5.");
                    break;
            }
        }
        scanner.close();
    }
}