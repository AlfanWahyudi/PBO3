/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan36.targetsaldotabungan;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung lama tabungan
 * sampai mencapai saldo target   
 */
public class PBO310117118Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tab = new Tabungan();
        
        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;
        
        tab.HitungLamaTarget(tab.saldo, saldoTarget);
    }
    
}
