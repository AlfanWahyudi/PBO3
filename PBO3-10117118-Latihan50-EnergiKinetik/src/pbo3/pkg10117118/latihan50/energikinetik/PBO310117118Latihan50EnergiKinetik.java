/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan50.energikinetik;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung nergi kinetik
 * 
 */
public class PBO310117118Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi objEnergi = new Energi();

        objEnergi.setMassa(0.145);
        objEnergi.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 gram dilempar"
                + " dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah Energi Kinetiknya ?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk "
                + "mencapai kecepatan ini jika dimulai dari keadaan diam ?");
        System.out.println("");
        System.out.println("=====JAWABAN=====");
        System.out.println("a. Energi Kinetiknya Adalah "
                + objEnergi.hitungEnergiKinetik() + " Joule");
        System.out.println("b. Usahanya adalah " + objEnergi.hitungUsaha()
                + " Joule");
        System.out.println("");
        System.out.println("Jadi energi kinetik dan usahanya bernilai sama yaitu "
                + "sebesar 45.3125 Joule");

    }

}
