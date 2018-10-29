/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan62.livingthing;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program Makhluk Hidup
 */
public class PBO310117118Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Human hm1 = new Human();
        hm1.setNama("Alfan Wahyudi");
        System.out.print(hm1.getNama()+" ");hm1.walk("");
        LivingThing lv1 = new LivingThing() {
            @Override
            public void walk(String nama) {
            }
        };
        System.out.print(hm1.getNama()+" ");lv1.breath("");
        System.out.print(hm1.getNama()+" ");lv1.eat("");
    
       
    }
    
}
