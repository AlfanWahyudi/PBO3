/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan35.tunjangan;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung Tunjangan 
 * karyawan
 */
public class PBO310117118Latihan35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Karyawan kar = new Karyawan();
        System.out.println("================Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scan.next();
        
        kar.HasilHitung(kar.status, kar.gajiPokok);
    }
    
}
