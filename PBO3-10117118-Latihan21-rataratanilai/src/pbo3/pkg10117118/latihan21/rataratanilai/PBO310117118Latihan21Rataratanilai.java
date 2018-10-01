/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author xider 
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk menghitung rata-rata
 *  nilai mahasiswa
 */
public class PBO310117118Latihan21Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double mahasiswa, rataRata;

        int[] nilai = new int[100];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukkan Banayaknya Mahasiswa : ");
        mahasiswa = keyboard.nextInt();

        int sum = 0;
        for (int no = 1; no <= mahasiswa; no++) {
            System.out.println("Nilai Mahasiswa ke- " + no + " : ");
            nilai[no] = keyboard.nextInt();
            sum += nilai[no];

        }
        rataRata = sum / mahasiswa;

        System.out.println("Maka rata-rata nilainya adalah" + rataRata + "\n");
        

    }

}
