package com.ug5a.soal1;


public class Transpay {

    private String name;

    private long saldo;

    public void setName(String name) {
        this.name = name;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public long getSaldo() {
        return saldo;
    }

    public void topUp(long nominal){
        if (nominal > 0 ){
            this.saldo += nominal ;
        }
        else{
            System.out.println("Input tidak valid!");
        }
    }

    public void bayar(int jumlah, keyboard K){
        if (jumlah <= 0){
            System.out.println("Jumlah barang yang dibeli kurang dari 0 Jumlah barang tidak valid!");
        }
        else if (jumlah >= 0){
            int harga = (int)(jumlah * K.getHarga());
            if (this.saldo < harga){
                System.out.println("Pembayaran Gagal! Saldo anda kurang, silahkan melakukan top up!");
            }
            if (this.saldo > harga){
                this.saldo = this.saldo - harga;
                String merk = K.getMerkModel();
                System.out.println("Pembayaran Sukses Silahkan mengambil" + merk);}
        }


    }
}
