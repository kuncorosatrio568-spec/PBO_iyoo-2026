package model;

import java.util.ArrayList;
import java.util.Scanner;


public class Service {
    private ArrayList<Buku> daftarBuku;
    
    private Scanner scanner;
    
    public Service (Scanner scanner){
     this.daftarBuku =new ArrayList<>();
        Scanner Scanner = null;
     this.scanner = Scanner;
    }
    
    public void tambahBuku (){
        System.out.print("ID Buku: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Judul Buku: ");
                        String judul = scanner.nextLine();
                        
                        System.out.print("Stok Buku: ");
                        int stok = scanner.nextInt();
                        scanner.nextLine();
                        
                        Buku bukuBaru = new Buku(id, judul, stok);
                        
                        daftarBuku.add(bukuBaru);
                        
                        
                        System.out.println(">> Buku berhasil ditambahkan!");
    }
    public void tampilkanBuku (){
        {
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            Buku b = daftarBuku.get(i);
                            System.out.println("ID Buku: " + b.getidBuku());
                            System.out.println("ID Buku: " + b.getJudul());
                            System.out.println("ID Buku: " + b.getStok());
                        }
        }
    }
    public void hapusBuku (){
        System.out.print("Masukkan ID Buku: ");
                        int idTarget = scanner.nextInt();
                        
                        for (Buku b : daftarBuku){
                            if(b.idbuku == idTarget){
                                daftarBuku.remove(b);
                                System.out.println(">> Buku berhasil dihapus!");
                                break;
                            }
                        }
    public void updateStok(){
        System.out.print("Masukkan ID Buku: ");
                        int idTarget = scanner.nextInt();
                        
                        for (Buku b : daftarBuku){
                            if (b.idbuku == idTarget){
                                System.out.println("Stok Baru: ");
                                b.stok = scanner.nextInt();
                                daftarBuku.remove(b);
                                System.out.println(">> Stok berhasil diperbarui!");
                                return;
    }
    }
        boolean berjalan = false;
}