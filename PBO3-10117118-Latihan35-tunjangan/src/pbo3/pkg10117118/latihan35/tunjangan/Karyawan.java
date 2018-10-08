/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan35.tunjangan;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung Tunjangan 
 * karyawan
 */
public class Karyawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;
    
    public double HitungTunjangan(String parStatus, double parGajiPokok){
        return tunjangan = (parStatus.equals("Menikah")?0.35*parGajiPokok:0);
    }
    public double HitungTotalGaji(double parGajiPokok, double parTunjangan){
        return tunjangan = parGajiPokok + parTunjangan;
    }
    public void HasilHitung (String perStatus, double parGajiPokok){
        System.out.println("\n=========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokook\t:"+gajiPokok);
        System.out.println("Tunjangan\t:"+HitungTunjangan(perStatus, parGajiPokok));
        System.out.println("Total Gaji\t:"+HitungTotalGaji(parGajiPokok, tunjangan));    
        System.out.println("");
    }
}
