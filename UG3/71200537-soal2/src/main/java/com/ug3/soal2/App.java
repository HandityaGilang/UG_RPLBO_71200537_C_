package com.ug3.soal2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //variable
        String kalimat1, kalimat2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("kalimat1 : ");
        kalimat1 = keyboard.nextLine();
        int total1 = kalimat1.length();
        System.out.println(total1);

        System.out.println("kalimat2 : ");
        kalimat2 = keyboard.nextLine();
        int total2 = kalimat2.length();
        System.out.println(total2);

        int jumlah1 = total1+total2;
        int jumlah2 = jumlah1+total2;
        int jumlah3 = jumlah2+jumlah1;
        int jumlah4 = jumlah3+jumlah2;
        int jumlah5 = jumlah4+jumlah3;
        int jumlah6 = jumlah5+jumlah4;

        System.out.println("Bilangan Fibonacci");
        System.out.println(total1 + " " + total2 + " " + jumlah1 + " " + jumlah2 + " " + jumlah3 + " " + jumlah4 + " " + jumlah5 + " " + jumlah6);

    }
}
