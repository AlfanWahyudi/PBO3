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
public class Mahasiswa {

    public String nim;
    public String nama;

    public void perkenalkanDiri(String nim, String nama) {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is" + nim);
        System.out.println("My Name is" + nama);
    }

}
