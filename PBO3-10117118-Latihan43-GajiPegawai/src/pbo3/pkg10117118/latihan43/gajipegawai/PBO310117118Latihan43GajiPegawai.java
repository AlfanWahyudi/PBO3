/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan43.gajipegawai;

/**
 *
 * @author xider 
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menghitung gaji pegawai
 */
public class PBO310117118Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Alfan Wahyudi");
        gp.setAlamat("Jalan Sekeloa Utara 1");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan(),
                gp.getUangTransport(), gp.getGajiPokok()));
        gp.tampilData(gp.getNama(),gp.getAlamat(),gp.getUangTunjangan(),
                gp.getUangTransport(), gp.getGajiPokok(),gp.getTotalGaji());

    }

}
