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
public class Bicycle extends Vehicle {

    private int myGearCount;

    public Bicycle() {

        Vehicle vc1 = new Vehicle();
        vc1.setMyBrand("Trek Bike");
        vc1.setMyModel("7.4FX");
        myGearCount = 23;
        System.out.println("Bicycle");
        System.out.println("Brand : " + vc1.getMyBrand());
        System.out.println("Model : " + vc1.getMyModel());
        System.out.println("Jumlah Gear : " + myGearCount);
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }

}
