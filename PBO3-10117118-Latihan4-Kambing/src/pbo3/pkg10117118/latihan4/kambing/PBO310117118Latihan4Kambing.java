/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan4.kambing;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menambahkan jumlah
 * kambing dan cara pengaksesan variabel
 */
public class PBO310117118Latihan4Kambing {
    public void tambahKambing(){
    //Deklarasi Variabel lokal
    int jumlahKambing=0;
    
    jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditamah : " +
                jumlahKambing);
    
    }   
    public static void main(String[] args) {
       PBO310117118Latihan4Kambing kambingJantan = new PBO310117118Latihan4Kambing();
       kambingJantan.tambahKambing();
        
    }
}

