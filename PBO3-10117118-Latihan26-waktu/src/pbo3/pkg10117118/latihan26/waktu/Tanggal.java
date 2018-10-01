/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan26.waktu;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author xider 
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk menunjukkan waktu
 * saat ini
 */
public class Tanggal {

    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("EEE dd MMMM YYY HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
