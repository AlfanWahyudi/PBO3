/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan38.perhitunganlingkaran;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan
 * lingkaran
 */
public class PBO310117118Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran ling = new Lingkaran();
        
        System.out.println("===============Perhitungan lingkaran=============");
        ling.ValidasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
