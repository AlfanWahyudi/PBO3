/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan32.daftafilm;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menampilkan Daftar Film
 */
public class Film {

    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;

    public void nowPlaying(String filmName, String filmGenre, Double filmRating,
            int filmDuration) {
        System.out.println("Judul Film\t:" + filmName);
        System.out.println("Genre Film\t:" + filmGenre);
        System.out.println("Rating Film\t:" + filmRating);
        System.out.println("Duration Film\t:" + filmDuration + " Menit");
    }

}
