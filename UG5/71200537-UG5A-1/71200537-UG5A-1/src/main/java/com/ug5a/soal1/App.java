package com.ug5a.soal1;

public class App
{
    public static void main(String[] args) {
        Transpay userA = new Transpay();
        userA.setName("Lukas Graham");
        userA.setSaldo(1000000);
        keyboard keyA = new keyboard();
        keyA.setMerkModel("Digital Alliance Meca Fighter Ice TKL SE");
        keyA.setHarga(310000);
        keyboard keyB = new keyboard();
        keyB.setMerkModel("Logitech K120");
        keyB.setHarga(94000);
        System.out.println("==========Skenario 1: Top Up Saldo==========");
        userA.topUp(-50000);
        userA.topUp(120000);
        System.out.println("===> Total saldo "+userA.getName()+": "+"Rp "+userA.getSaldo());
        System.out.println("\n==========Skenario 2: Pembelian Keyboard==========");
        System.out.println("\n"+userA.getName()+" melakukan pembelian...\n");
        userA.bayar(-5,keyA);
        userA.bayar(1,keyA);
        userA.bayar(2,keyB);
        userA.bayar(5,keyA);
        System.out.println("===> Total saldo "+userA.getName()+": "+"Rp "+userA.getSaldo());
    }
}
