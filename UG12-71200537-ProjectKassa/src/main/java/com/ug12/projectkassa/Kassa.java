package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    public Kassa(){

    }
    private HashMap<Produk,Integer> pesanan = new HashMap<>();
    private ArrayList<Kasir> arrKasir = new ArrayList<>();
    private Kasir kasir;

    public void login(String username,String password){
        for (Kasir kasir :arrKasir){

            if(username == kasir.getUsername() && password == kasir.getPassword()){
                System.out.println("Login Berhasil!");
                this.kasir = kasir;

            }else {
                System.out.println("Username/Password Anda Salah");
            }
        }
    }

    public void register(Kasir kasir){
        arrKasir.add(kasir);
        System.out.println("Kasir " +kasir.getNama()+"Berhasil ditambahkan ke dalam sistem");
    }

    public void tambahPesanan(Produk produk,int jumlah){
        pesanan.put(produk,jumlah);

    }
    public void printNota(){
        int i= 1;
        long hasil= 0;
        //long subtotal=0;
        System.out.println("=====NOTA=====");
        System.out.println("Kasir: "+ kasir.getNama());
        System.out.println("No \t Nama Barang \t Jumlah \t Harga \t\t Sub Total");
        for ( Produk produk:pesanan.keySet()){
            int a = i++;
            String banyak = pesanan.get(produk).toString();
            long subtotal = hasil+pesanan.get(produk)*produk.getHarga();
            System.out.println(a+"\t" +produk.getNama()+"\t\t"+banyak+"x\t\tRp"+produk.getHarga()+"\t\tRp"+subtotal);
        }
        kasir.setTotalPenjualan(hasil+kasir.getTotalPenjualan());
        System.out.println("Total: Rp"+hasil);
        pesanan.clear();



    }

    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir:");
        System.out.println("No \t Nama \t\t\t Total penjualan");
        int i= 1;
        for (Kasir kasir:arrKasir ){
            int a = i++;
            System.out.println(a+"\t"+kasir.getNama()+"\t\tRp"+ kasir.getTotalPenjualan());
        }


    }
}
