/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung otomatis 
 * seperti kalkulator
 */
public class PBO310117118Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        
        System.out.println("======Aplikasi Kalkulator Bilangan=========");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 :");
        kal.value2 = scan.nextDouble();
        
        
        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("");
        
        System.out.println("\nHasil Penjumlahan: "+kal.tambahBilangan());
        System.out.println("Hasil Pengurangan: "+kal.kurangBilangan());
        System.out.println("Hasil Perkalian\t : "+kal.kaliBilangan());
        System.out.println("Hasil Pembagian\t : "+df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa\t :"+kal.sisaBilangan());
    }
    
}
