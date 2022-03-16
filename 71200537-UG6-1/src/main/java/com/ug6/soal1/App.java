package com.ug6.soal1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner inputan = new Scanner(System.in);

        System.out.println("Buat Vending Machine Terlebih Dahulu");
        System.out.println("================================================");
        //input kapasitas maksimal
        System.out.println("Kapasitas Maximal: ");
        int kapasmax = inputan.nextInt();
        //pilihan barang y dan n
        System.out.println("Apakah anda akan menambahkan barang sekarang?");
        System.out.println("ya(y) atau tidak(n): ");
        String yatidak = inputan.nextLine();
        System.out.println("Type barang:");
        System.out.println("1. Minuman");
        System.out.println("2. Makanan");
        System.out.println("3. Produk Digital");
        System.out.println("Pilihan (1/2/3): ");
        String pilihan = inputan.nextLine();




    }
}
