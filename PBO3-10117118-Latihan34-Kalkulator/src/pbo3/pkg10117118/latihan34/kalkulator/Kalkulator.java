/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan34.kalkulator;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung otomatis 
 * seperti kalkulator
 */
public class Kalkulator {

    public double value1;
    public double value2;

    public double tambahBilangan() {
        return value1 + value2;
    }

    public double kurangBilangan() {
        return value1 - value2;
    }

    public double kaliBilangan() {
        return value1 * value2;
    }

    public double bagiBilangan() {
        return value1 / value2;
    }

    public double sisaBilangan() {
        return value1 % value2;
    }
}
