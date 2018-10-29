/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan59.conan;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program tentang beberapa karakter dari
 * anime detective conan
 */
public class SupportCharacter extends Character {

    private String related;

    public SupportCharacter(String related, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.related = related;
    }

    public String getRelated() {
        return related;
    }

    public void displayCharacter() {
        System.out.println("-----");
        System.out.println("Nama : " + name);
        System.out.println("-----");
        System.out.println("Dari : " + from);
        if (eyeglasses) {
            System.out.println("Kecamata : Iya");
        } else {
            System.out.println("Kecamata : Tidak");
        }
        System.out.println("Hubungan dengan tokoh utama : " + related);
        System.out.println();
    }
}
