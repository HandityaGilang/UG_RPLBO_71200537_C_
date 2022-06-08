package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;

    private String nama;

    private  String spesialis;

    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if (jadwal.isStatusScreening() == false || jadwal.isStatusDaftar() == false){
            System.out.println("==================ANDA BELUM MENDAFTAR DAN SCREENING==================");
        }else {
            if (pasien.getLevelPenyakit() >= 0){
                pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
                pasien.setStatus(true);
                pasien.setLevelPenyakit(0);
                System.out.println("======PASIEN ANDA MASIH SAKIT======");

            }
            System.out.println("====PASIEN SUDAH SEMBUH=====");
        }


    }

    public void cekStatus(Pasien pasien, Jadwal jadwal){
        boolean status = pasien.getStatus();
        System.out.println(status);

    }
}
