package com.ug14.rumahsakit;

import java.sql.*;

public class DAO {

    public int getDokterByID(int dokter) {
        String Street = "SELECT idDokter FROM jadwal WHERE" +
                " idDokter='" + dokter + "';";

        int i = 0;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            Statement state = conn.createStatement();

            ResultSet result = state.executeQuery("SELECT * FROM jadwal WHERE" + " idDokter='" + dokter);

            if(result.next()) {
                i=result.getInt("idDokter");
            }

        } catch (Exception e) {
            System.err.println("Error ");
            System.err.println(e.getMessage());

        }
        return i;
    }
    public int getSusterByID(int suster){
        int i = 0;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            Statement state = conn.createStatement();

            ResultSet result = state.executeQuery("SELECT * FROM jadwal WHERE" + " idSuster='" + suster);

            if(result.next()) {
                i=result.getInt("idSuster");
            }

        } catch (Exception e) {
            System.err.println("Error ");
            System.err.println(e.getMessage());

        }
        return i;

    }

    public int getPelayananByID(int pelayanan){
        int i = 0;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            Statement state = conn.createStatement();

            ResultSet result = state.executeQuery("SELECT * FROM jadwal WHERE" + " idPemeriksaan='" + pelayanan);

            if(result.next()) {
                i=result.getInt("idPemeriksaan");
            }

        } catch (Exception e) {
            System.err.println("Error ");
            System.err.println(e.getMessage());

        }
        return i;

    }

    public void inputPasien(Pasien pasien){
        int rm = pasien.getRm();
        String nama = pasien.getNama();
        int usia = pasien.getUsia();
        String alamat = pasien.getAlamat();
        try {
            String url = "jdbc:msql://localhost:3306/rumahsakit";
            Connection conn = DriverManager.getConnection(url,"root","");
            String SQL = "INSERT INTO pasien (rm, nama, usia, alamat)";
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

    }

}
