package com.ug3.soal1;

import java.util.Scanner;

public class UG3soal1 {

    public static void main(String[] args){
        //variabel
        String nama, Tanggal;
        float Jumlah, Berat;

        //scanner baru
        Scanner keyboard = new Scanner(System.in);

        //tampilan input
        System.out.println("=============Data Product============");
        System.out.println("Masukan Data Product Makanan anda");
        //makanan
        System.out.println("Nama Makanan:");
        nama = keyboard.nextLine();
        //kadaluarsa
        System.out.println("Tanggal Kadaluarsa:");
        Tanggal = keyboard.nextLine();
        //jumlah
        System.out.println("Jumlah(Quantity):");
        Jumlah = keyboard.nextFloat();
        //Berat
        System.out.println("Berat(gram):");
        Berat = keyboard.nextFloat();

        //output
        System.out.println("=============Data Product============");
        System.out.println("Nama Makanan:"+ nama);
        System.out.println("Tanggal Kadaluarsa:"+ Tanggal);
        System.out.println("Jumlah(Quantity)"+ Jumlah);
        System.out.println("Berat(gram):"+ Berat + "gram");

    }
}
