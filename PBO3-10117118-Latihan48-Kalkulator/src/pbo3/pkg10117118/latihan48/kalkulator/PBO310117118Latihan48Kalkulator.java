/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan48.kalkulator;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung penjumlahan
 * pengurangan pembagian dan perkalian secara otomatis
 */
public class PBO310117118Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        //kal value
        Kalkulator kal1 = new Kalkulator();
        //kal1 project
        Kalkulator kal2 = new Kalkulator();
        //kal2 result
        
        
        kal.setValue1(7.0);
        kal.setValue2(5.0);
        System.out.println("VALUE 1 = "+kal.getValue1());
        System.out.println("VALUE 2 = "+kal.getValue2());
        kal1.setNameProject();
        kal1.setNoteProject("");
        System.out.println("Result Add is = "+ kal2.add(kal.getValue1(),
                kal.getValue2()));
        System.out.println("Result Minus is = "+ kal2.minus(kal.getValue1(), 
                kal2.getValue2()));
        System.out.println("Result Multiple is = "+kal2.multlipication(
                kal.getValue1(), kal.getValue2()));
        System.out.println("Result Division is = "+ kal2.division(kal.getValue1()
                , kal.getValue2()));
        
    }
    
}
