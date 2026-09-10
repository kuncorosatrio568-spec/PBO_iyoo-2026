package rentalbaju;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayList untuk menyimpan data baju
    private static ArrayList<BajuAdat> listBaju = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Data awal (Dummy data)
        listBaju.add(new BajuAdat("B01", "Baju Bodo", "Sulawesi Selatan", 150000));
        listBaju.add(new BajuAdat("B02", "Ulos", "Sumatera Utara", 200000));

        boolean running = true;

        // Perulangan agar program tidak berhenti kecuali user memilih keluar
        while (running) {
            System.out.println("\n=========================================");
            System.out.println(" SYSTEM RENTAL BAJU ADAT TRADISIONAL ");
            System.out.println("=========================================");
            System.out.println("1. Tambah Data Baju Adat (Create)");
            System.out.println("2. Tampilkan Daftar Baju Adat (Read)");
            System.out.println("3. Ubah Data Baju Adat (Update)");
            System.out.println("4. Hapus Data Baju Adat (Delete)");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu (1-5): ");

            // Validasi Input Angka
            int pilihan = validasiInputAngka();

            // Percabangan memilih menu
            switch (pilihan) {
                case 1:
                    tambahBaju();
                    break;
                case 2:
                    tampilkanBaju();
                    break;
                case 3:
                    ubahBaju();
                    break;
                case 4:
                    hapusBaju();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        }
    }

    // 1. CREATE
    private static void tambahBaju() {
        System.out.println("\n--- Tambah Baju Adat ---");
        System.out.print("Masukkan ID Baju: ");
        String id = scanner.nextLine();
        
        System.out.print("Masukkan Nama Baju: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Asal Daerah: ");
        String asal = scanner.nextLine();
        
        System.out.print("Masukkan Harga Sewa / Hari: ");
        double harga = validasiInputDouble();

        // Menerapkan Constructor & ArrayList Add
        listBaju.add(new BajuAdat(id, nama, asal, harga));
        System.out.println("Data Baju Adat berhasil ditambahkan!");
    }

    // 2. READ (Perulangan menampilkan data)
    private static void tampilkanBaju() {
        System.out.println("\n--- Daftar Baju Adat Tradisional ---");
        if (listBaju.isEmpty()) {
            System.out.println("Belum ada data baju adat.");
        } else {
            for (int i = 0; i < listBaju.size(); i++) {
                BajuAdat b = listBaju.get(i);
                System.out.println((i + 1) + ". ID: " + b.getIdBaju() 
                        + " | Nama: " + b.getNamaBaju() 
                        + " | Asal: " + b.getAsalDaerah() 
                        + " | Harga/Hari: Rp" + b.getHargaSewa());
            }
        }
    }

    // 3. UPDATE
    private static void ubahBaju() {
        tampilkanBaju();
        if (listBaju.isEmpty()) return;

        System.out.print("\nMasukkan ID Baju yang ingin diubah: ");
        String idUbah = scanner.nextLine();

        BajuAdat bajuDitemukan = cariBaju(idUbah);

        if (bajuDitemukan != null) {
            System.out.print("Masukkan Nama Baju Baru: ");
            bajuDitemukan.setNamaBaju(scanner.nextLine());

            System.out.print("Masukkan Asal Daerah Baru: ");
            bajuDitemukan.setAsalDaerah(scanner.nextLine());

            System.out.print("Masukkan Harga Sewa Baru: ");
            bajuDitemukan.setHargaSewa(validasiInputDouble());

            System.out.println("Data Baju Adat berhasil diubah!");
        } else {
            System.out.println("Data dengan ID tersebut tidak ditemukan!");
        }
    }

    // 4. DELETE
    private static void hapusBaju() {
        tampilkanBaju();
        if (listBaju.isEmpty()) return;

        System.out.print("\nMasukkan ID Baju yang ingin dihapus: ");
        String idHapus = scanner.nextLine();

        BajuAdat bajuDitemukan = cariBaju(idHapus);

        if (bajuDitemukan != null) {
            listBaju.remove(bajuDitemukan);
            System.out.println("Data Baju Adat berhasil dihapus!");
        } else {
            System.out.println("Data dengan ID tersebut tidak ditemukan!");
        }
    }

    // Helper: Cari Baju berdasarkan ID
    private static BajuAdat cariBaju(String id) {
        for (BajuAdat b : listBaju) {
            if (b.getIdBaju().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    // Value Added: Validasi Input Angka (Mencegah Crash saat user input huruf)
    private static int validasiInputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.println("Input salah! Harap masukkan angka.");
            scanner.next();
            System.out.print("Coba lagi: ");
        }
        int nilai = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        return nilai;
    }

    private static double validasiInputDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Input salah! Harap masukkan angka harga yang benar.");
            scanner.next();
            System.out.print("Coba lagi: ");
        }
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // clear buffer
        return nilai;
    }
}