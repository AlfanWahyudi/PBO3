/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan5.kambingglobal;

/**
 *
 * @author xider
 * 
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menambahkan jumlah
 * kambing global dan cara pengaksesan variabel

 */
public class PBO310117118Latihan5Kambingglobal {
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
           System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5 ;
        System.out.println("Jumlah Kambing Setelah ditambah: "+
                            jumlahKambing);
    }
    public static void main(String[] args) {
        PBO310117118Latihan5Kambingglobal kambingSusu = new 
        PBO310117118Latihan5Kambingglobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing(); 
        
        
    }
    
}
