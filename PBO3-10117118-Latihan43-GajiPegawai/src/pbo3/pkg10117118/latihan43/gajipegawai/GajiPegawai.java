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
public class GajiPegawai {

    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    public int gajiPokok;
    public int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {

        return totalGaji = uangTunjangan + uangTransport + gajiPokok;
    }

    public void tampilData(String nama, String alamat, 
            int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
        System.out.println("Nama Karyawan  : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Uang Transport : Rp " + uangTransport);
        System.out.println("Uang Tunjangan : Rp " + uangTunjangan);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
        System.out.println("TOTAL GAJI     : Rp " + totalGaji);
    }

}
