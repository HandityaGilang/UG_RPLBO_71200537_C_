package com.ug13.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){
        if (pasien.getStatus() == true){
            System.out.println("pasien mendaftar");
        }else {
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            jadwal.setStatusDaftar(true);
        }
    }
    public Pasien registrasi(){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        System.out.println("Masukan Nama anda: ");
        String nama = input.nextLine();
        System.out.print("Masukan Usia anda : ");
        int usia = input2.nextInt();
        System.out.println("Masukan Alamat anda: ");
        String alamat = input3.nextLine();
        System.out.println("Masukan Penyakit anda: ");
        String Penyakit = input4.nextLine();
        return new Pasien(nama,usia,alamat,Penyakit);
    }
}
