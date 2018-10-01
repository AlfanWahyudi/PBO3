/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk melakukan perbandingan dua buah
 * nilai
 */
public class PBO310117118Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1,nilai2;
        String jawab = "Ya";
        String jawab1;
                
        while("Ya".equals(jawab)){
        Scanner doyen = new Scanner(System.in);

        System.out.println("=========Program Perbandingan===========");
        System.out.print("Masukkan Nilai Pertama : ");
        nilai1 = doyen.nextInt();
        System.out.print("Masukkan Nilai Kedua : ");
        nilai2 = doyen.nextInt();
        

        if(nilai1 > nilai2){
            System.out.println("Hasil : "+nilai1+"Lebih besar dari"+nilai2);
        } else if (nilai2 > nilai1){
            System.out.println("Hasil : "+nilai2+"Lebih besar dari"+nilai1);
        }
        
            System.out.print("Ulangi Aktifitas (Ya/Tidak) : ");
            jawab = doyen.next();
    }
   }
}
