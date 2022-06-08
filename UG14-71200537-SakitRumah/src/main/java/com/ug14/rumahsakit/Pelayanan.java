package com.ug14.rumahsakit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Pelayanan {

    private int idPelayanan;

    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal){
        jadwal.setPasien(pasien);
        jadwal.setDokter(dokter);
        jadwal.setSuster(suster);
        jadwal.setStatusDaftar(true);
    }
    public Pasien registrasi(){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        System.out.println("Masukan rm baru : ");
        int rm = Integer.parseInt(input5.nextLine());
        System.out.println("Masukan Nama anda: ");
        String nama = input.nextLine();
        System.out.print("Masukan Usia anda : ");
        int usia = input2.nextInt();
        System.out.println("Masukan Alamat anda: ");
        String alamat = input3.nextLine();
        System.out.println("Masukan Penyakit anda: ");
        String Penyakit = input4.nextLine();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahsakit","root","");
            String SQL = "INSERT INTO pasien (rm, nama, usia, alamat) VALUES ( ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, rm);
            pstmt.setString(2, nama);
            pstmt.setInt(3, usia);
            pstmt.setString(4, alamat);
            pstmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            System.err.println("Error ");
            System.err.println(e.getMessage());
        }
        System.out.println("Data Pasien Berhasil Disimpan!");
        System.out.println("==================Proses Registrasi Berhasil======================");

        return new Pasien(nama,usia,alamat,Penyakit);
    }

}
