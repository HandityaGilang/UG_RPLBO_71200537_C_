package com.ug11.kalkulasirupiah;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner masukan = new Scanner(System.in);
        System.out.println("\n Masukan teks: \n");
        String hasil = masukan.nextLine();
        String a = hasil.substring(34,42);
        String aubah = a.replaceAll("[.Rp]","");
        String b = hasil.substring(67,75);
        String bubah = b.replaceAll("[.Rp]","");;
        int aa = Integer.valueOf(aubah);
        int bb = Integer.valueOf(bubah);
        System.out.println("\n Rincian Biaya: "+a +",00 " +" + "+ b + ",00" );
        int hasill = aa+bb;
        System.out.println("\n Total : Rp"+hasill+",00");
    }
}
