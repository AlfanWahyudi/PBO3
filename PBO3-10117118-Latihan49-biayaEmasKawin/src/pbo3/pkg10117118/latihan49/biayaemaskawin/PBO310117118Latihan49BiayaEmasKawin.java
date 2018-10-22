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
 * 
 */
public class PBO310117118Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        emas objEmas= new emas();
        objEmas.setHarga(570000);
        objEmas.setTotalBerat(15.7);
        System.out.println("Hendi Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat " +objEmas.getTotalBerat()
                + " gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp "+objEmas.getHarga()+
                ". Berapa total");
        System.out.println("harus dikeluarkan oleh hendi ?");
        System.out.println("");
        System.out.println("Jadi Biaya Yang Harus Dikeluarkan Oleh Hendi Adalah "
                + "Rp."+objEmas.perhitungan());

    
        
    }
    
}
