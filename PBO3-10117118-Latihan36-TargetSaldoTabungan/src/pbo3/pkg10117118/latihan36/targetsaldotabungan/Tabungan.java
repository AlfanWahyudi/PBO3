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
public class Tabungan {

    public int saldo;
    public int bunga;

    public double HitungBunga(int parSaldo, int ParBunga) {
        return parSaldo * ParBunga / 100;
    }

    public void HitungLamaTarget(int parSaldo, int parSaldoTarget) {
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            HitungBunga(parSaldo, bunga);
            parSaldo += HitungBunga(parSaldo, bunga);
            
            String mataUang = String.format("Rp.%,3d", parSaldo).
                    replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + "%s%n", mataUang);
            i++;
        }
    }
}
