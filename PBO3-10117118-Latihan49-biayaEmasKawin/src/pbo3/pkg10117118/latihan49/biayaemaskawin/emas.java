/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan49.biayaemaskawin;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya yang 
 * harus di keluarkan hendi
 */
public class emas {
    private double totalBerat;
    private int harga;

    public double getTotalBerat() {
        return totalBerat;
    }

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double perhitungan(){
        return harga*totalBerat;
    }
    
}
