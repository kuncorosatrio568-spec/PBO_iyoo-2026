package com.mycompany.pertemuan1java;

import model.Buku;
import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Scanner;


public class Pertemuan1java {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in));
        Service service = new Service (scanner);
        }
            boolean berjalan = true;
        
            while (berjalan) {
                
                System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN ===");
                System.out.println("1. Tambah");
                System.out.println("2. Tampilkan");
                System.out.println("3. Hapus");
                System.out.println("4. Update Stok");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                switch (pilihan) {
                    case 1 -> service.tambahBuku();
                    case 2 -> service.tampilkanBuku();
                    case 3 -> service.hapusBuku ();
                    case 4 -> 
                        
                            }
                        }
                    }
                    case 5 -> static {
                        
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }   
}