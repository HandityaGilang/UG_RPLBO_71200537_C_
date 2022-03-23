package com.ug7.ewallet;

import java.util.Scanner;

public class GoPay extends eWallet {
    //variable
    private int feeTopup = 1000;
    private int feeTransfer = 500;
    private int feeWithdraw = 2500;

    //method
    public GoPay(User user) {
        super(user);
    }

    public void topup(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("minimal top up Rp10.000,00");
            return;
        }
        if (jumlah + this.feeTopup > getUser().getUang()) {
            jumlah = jumlah + this.feeTopup;
            System.out.println("uang tidak cukup " + Main.formatRupiah(getSaldo() - jumlah));
            return;
        }
        super.topup(jumlah);
    }

    public void transfer(eWallet eWallet, int jumlah) {
        System.out.print("Masukkan PIN kamu: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.print("Validasi PIN");;
        if (password != (getUser().getPIN())) {
            System.out.println("PIN SALAH");
            return;
        }
        System.out.println("Transfer saldo kena potongan fee Rp" +this.feeTransfer);
        System.out.print("Transfer sedang diproses");
        if (jumlah + this.feeTransfer >getSaldo()) {
            jumlah = jumlah +  this.feeTransfer;
            System.out.println("saldo tidak cukup "  + Main.formatRupiah(getSaldo() - jumlah));
            return;
        }
        super.transfer(eWallet, jumlah);
    }

    public void withdraw(int jumlah) {
        System.out.println("Withdraw saldo akan terkena potongan fee " + Main.formatRupiah(this.feeWithdraw));
        if (jumlah + this.feeWithdraw > getSaldo()) {
            jumlah = jumlah + this.feeWithdraw;
            System.out.println("saldo tidak cukup " + Main.formatRupiah(getSaldo() - jumlah) );
            return;
        }
        super.withdraw(jumlah);
    }

    public void getInfo() {
        System.out.println("[Gopay e-Wallet]");
        super.getInfo();
    }
}
