/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menarik uang di bank
 *
 */
public class PBO310117118Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("========Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo anda sekarang : "
                + tabungan.ambilUang(scan.nextInt()) + "\n");
    }

}
