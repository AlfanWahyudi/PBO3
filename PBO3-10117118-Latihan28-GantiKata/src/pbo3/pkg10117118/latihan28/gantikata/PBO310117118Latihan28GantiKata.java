/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk mengganti kata 
 */
public class PBO310117118Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat, replace, kalimat1, ganti;

        Scanner doyen = new Scanner(System.in);

        System.out.println("=============Program Mengganti Kata===========");
        System.out.print("Masukkan Kalimat : ");
        kalimat = doyen.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = doyen.nextLine();
        System.out.print("Menjadi : ");
        replace = doyen.nextLine();

        kalimat1 = kalimat.replaceAll(ganti, replace);

        System.out.println("============Hasil Formatting============");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimat1);
    }

}
