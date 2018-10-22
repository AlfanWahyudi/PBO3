/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan41.masajenis;


/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung volume 
 * kubus dan massajenisnya
 */
public class PBO310117118Latihan41MasaJenis {

    /**
     * MASSANA CAN JADI "MASSA / VOLUME "
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("=======MassaJenisKubus=======");
        System.out.println("Sisi  : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());
        System.out.println("");
        System.out.println("=============Hasil Perhitungan=======");

       //output 
        System.out.println("Volume      : "+kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : "+  kubus.hitungMassaJenis
        (kubus.getMassa(), kubus.hitungVolume(0)));
        
        
    }
    
}
