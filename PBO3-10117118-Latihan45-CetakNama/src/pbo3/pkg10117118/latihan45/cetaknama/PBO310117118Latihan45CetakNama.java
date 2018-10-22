/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk mencetak nama
 */
public class PBO310117118Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("======Aplikasi Pencetak Nama=======");
        System.out.print("Masukkan Nama Anda : ");
        print.setNama(scan.next());
        System.out.print("Mau Cetak Berapa Kali ? : ");
        print.setJmlCetak(scan.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
