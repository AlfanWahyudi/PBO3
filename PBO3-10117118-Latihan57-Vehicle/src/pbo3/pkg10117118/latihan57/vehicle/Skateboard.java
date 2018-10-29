/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan57.vehicle;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk mengetahui spesifikasi 
 * kendaraan seperti sepeda dan sketeboard
 */
public class Skateboard extends Vehicle {

    private double myBoardLength;

    public Skateboard() {
        this.myBoardLength = myBoardLength;
        Vehicle vc2 = new Vehicle();
        vc2.setMyBrand("Ally Skate");
        vc2.setMyModel("Rocket");
        myBoardLength = 54.5;
        System.out.println("Skateboard");
        System.out.println("Brand : " + vc2.getMyBrand());
        System.out.println("Model : " + vc2.getMyModel());
        System.out.println("Panjang Board : " + myBoardLength);
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

}
