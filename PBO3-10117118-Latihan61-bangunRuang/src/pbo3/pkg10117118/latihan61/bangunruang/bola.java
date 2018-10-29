/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan61.bangunruang;

/**
 *
 * @author xider
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk menghitung volume bangun
 * ruang
 */
public class bola extends bangunRuang {

    private int jari2;

    public bola(int jari2) {
        this.jari2 = jari2;

    }

    public int getJari2() {
        return jari2;
    }

    @Override
    public float hitungVolume() {
        return  (float) (((3.14 * jari2 * jari2 * jari2) * 4) / 3);
    }

}
