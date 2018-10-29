/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan56.umurbarangantik;

/**
 *
 * @author xiderNAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk mengetahui umur barang 
 * antik
 * 
 */
public class BarangAntik {

    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;

    }

    public void tampilUmur() {
        Radio rd = new Radio(234);
        System.out.println("Umur barang antik ini adalah : " + rd.umur + " tahun");

    }

}
