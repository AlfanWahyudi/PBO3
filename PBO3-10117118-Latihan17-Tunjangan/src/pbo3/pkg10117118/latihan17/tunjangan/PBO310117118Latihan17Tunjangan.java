/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung tunjangan  
 */
public class PBO310117118Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok, tunjangan, totalGaji;
        String status=null;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Program Tunjangan========");
        System.out.println("Berapa gaji pokok anda perbulan?: Rp");
        gajiPokok = scanner.nextDouble();
        System.out.println("Status Anda? (Menikah/Belum) : ");
        status = scanner.next();
        
        if("Menikah".equals(status)){ 
            tunjangan = gajiPokok * 0.35;
            
        }else tunjangan = 0;
                totalGaji = tunjangan + gajiPokok;
        
        System.out.println("===========Hasil Perhitungan Anda==========");
        System.out.println("Gaji Pokok\t\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp " + totalGaji);
    }
    
}
