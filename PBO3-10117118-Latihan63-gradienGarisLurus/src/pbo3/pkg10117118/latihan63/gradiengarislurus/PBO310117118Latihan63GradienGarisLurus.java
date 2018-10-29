/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan63.gradiengarislurus;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung gradien garis
 * lurus
 */
public class PBO310117118Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat kr1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+kr1.getX1()+","+kr1.getY1()
                +")"+" dan "+"("+kr1.getX2()+","+kr1.getY2()+")");
        System.out.println("memiliki gradien sebesar "+kr1.hitungGradien());
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        
        
        Koordinat kr2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+kr2.getX1()+","+kr2.getY1()
                +")"+" dan "+"("+kr2.getX2()+","+kr2.getY2()+")");
        System.out.println("memiliki gradien sebesar "+kr2.hitungGradien());
    }
    
}
