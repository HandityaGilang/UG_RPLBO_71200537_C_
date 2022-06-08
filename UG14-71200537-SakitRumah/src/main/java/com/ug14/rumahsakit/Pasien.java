package com.ug14.rumahsakit;

public class Pasien {
    private int rm;

    private String nama;

    private int usia;

    private String alamat;

    private String penyakit;

    private int LevelPenyakit;

    private boolean status = false;

    public Pasien(String nama, int usia, String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public Pasien(String nama, int usia, String alamat,String penyakit){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public int getRm() {
        return rm;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getNama() {
        return nama;
    }

    public int getLevelPenyakit() {
        return LevelPenyakit;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void setLevelPenyakit(int levelPenyakit) {
        LevelPenyakit = levelPenyakit;
    }


}
