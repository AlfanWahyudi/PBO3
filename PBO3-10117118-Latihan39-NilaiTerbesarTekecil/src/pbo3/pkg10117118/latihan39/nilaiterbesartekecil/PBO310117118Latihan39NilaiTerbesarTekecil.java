/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan39.nilaiterbesartekecil;

import java.util.Scanner;

/**
 *
 * @author xider 
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menampilkan nilai 
 * terbesar dan terkecil mahasiswa
 */
public class PBO310117118Latihan39NilaiTerbesarTekecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Scanner scan = new Scanner(System.in);

        int bykMah;
        String nama;
        System.out.println("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scan.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = scan.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);

        System.out.println("\n" + "Petugas : " + nama);

    }

}
