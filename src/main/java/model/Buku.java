/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Buku {
    public int idbuku;
    public String judul;
    public int stok;
    public int idBuku;
    
    public Buku(int idbuku, String judul,int stok){
        this .idbuku = idbuku;
        this .judul = judul;
        this .stok = stok;
    }
    
    public  void tampilkanInfo(){
        System.out.println("ID BUKU "+ idbuku);
        System.out.println("Judul Buku"+ judul);
        System.out.println("Stok Buku"+ stok);
    }

    String getidBuku() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getJudul() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getStok() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}