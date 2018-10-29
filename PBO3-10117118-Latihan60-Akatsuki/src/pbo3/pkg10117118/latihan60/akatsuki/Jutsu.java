package pbo3.pkg10117118.latihan60.akatsuki;

public class Jutsu extends Akatsuki {

    private String jutsu;

    private String elemen;

    public Jutsu(String nama, String asal, String jutsu, String elemen, String cincin, String posisi) {
        super(nama, asal, cincin, posisi);
        this.nama = nama;
        this.asalDesa = asal;
        this.jutsu = jutsu;
        this.elemen = elemen;
        this.posisiCincin = posisi;
        this.cincin = cincin;
    }

    public String getJutsu() {
        return jutsu;
    }

    public String getElemen() {
        return elemen;
    }
}
