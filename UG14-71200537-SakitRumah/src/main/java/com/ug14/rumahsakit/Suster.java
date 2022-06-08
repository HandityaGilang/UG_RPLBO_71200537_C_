package com.ug14.rumahsakit;

public class Suster {
    public int idSuster;

    public String nama;

    public Suster(String nama){
        this.nama = nama;
    }

    public void screening(Pasien pasien,Jadwal jadwal){
        if (pasien.getPenyakit() == null){
            System.out.println("================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN=============");
        } else{
            jadwal.setStatusScreening(true);

        }

    }

}
