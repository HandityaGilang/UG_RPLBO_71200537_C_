package com.ug13.rumahsakit;

public class Jadwal {
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar = false;
    private boolean statusScreening = false;

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public Suster getSuster() {
        return suster;
    }

    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    public boolean isStatusScreening() {
        return statusScreening;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public void setPelayanan(Pelayanan pelayanan) {
        this.pelayanan = pelayanan;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

}
