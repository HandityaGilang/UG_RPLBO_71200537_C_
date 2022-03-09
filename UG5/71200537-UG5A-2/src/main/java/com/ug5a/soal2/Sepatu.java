package com.ug5a.soal2;

public class Sepatu {

    private String kode;

    private static int nextNum = 1 ;

    private String merkModel;

    private int ukuran;

    private long harga;

    private int stok;

    public Sepatu(String argMerkModel, int argUkuran, long argHarga, int argStok){
        this.merkModel = argMerkModel;
        this.ukuran = argUkuran;
        this.harga = argHarga;
        this.stok = argStok;
        String nama = "NK0024510";
        kode = nama + nextNum++;
    }



    public String getKode() {
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }


}
