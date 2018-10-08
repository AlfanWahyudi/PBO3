/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan31.perkenalanmahasiswa;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menampilkan nama dan nim
 * mahasiswa
 */
public class PBO310117118Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117118";
        mhs1.nama = "Alfan Wahyudi";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);
        System.out.println("");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10117110";
        mhs2.nama = "Agen Surageng";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
        System.out.println("");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "1011026";
        mhs3.nama = "Muhammad Nur Awaludin";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
        System.out.println("");
        
    }
    
}
