/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan54.koordinat;



/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program koordinat warna
 */
public class warnaKoodinat extends Koordinat{
    public String namaWarna;

    public warnaKoodinat(int x, int y, String namaWarna) {
        
        super(x, y);
        this.namaWarna = namaWarna;
        this.x = x;
        this.y = y;
        
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
   
    
}
