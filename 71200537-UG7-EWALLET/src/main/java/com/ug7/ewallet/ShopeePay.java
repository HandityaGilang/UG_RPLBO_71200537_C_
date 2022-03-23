package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    //variable
    private int feeTopup = 500;
    private int feeTransfer = 0;
    private int feeWithdraw = 1000;
    private int saldo = 0;

    //method
    public ShopeePay( User user){
        super(user);
    }

    public void topup(int jumlah) {
        if (jumlah + this.feeTransfer > getUser().getUang()) {
            jumlah = jumlah + this.feeTransfer;
            System.out.println("uang kamu tidak cukup " + Main.formatRupiah(getSaldo() - jumlah) + ")");
            return;
        }
        super.topup(jumlah);
    }
    public void transfer(eWallet eWallet, int jumlah) {
        if (!getUser().isEmailConfirmed()) {
            System.out.println("Hal " + getUser().getNama() + "! Silakan konfirmasi email terlebih dahulu!");
        }
        System.out.println("Transfer saldo akan terkena potongan fee Rp" + this.feeTransfer);
        System.out.print("Transfer sedang diproses");
        if (jumlah + this.feeTransfer > getSaldo()) {
            jumlah = jumlah + this.feeTransfer;
            System.out.println("saldo tidak cukup " + Main.formatRupiah(getSaldo() - jumlah));
            return;
        }
        super.transfer(eWallet, jumlah);
    }
    public void withdraw(int jumlah) {
        System.out.println(" saldo akan terkena potongan fee Rp "+ this.feeWithdraw);
        if (jumlah + this.feeWithdraw > getSaldo()) {
            jumlah = jumlah + this.feeWithdraw;
            System.out.println("saldo tidak cukup " + Main.formatRupiah(getSaldo() - jumlah) + ")");
            return;
        }
        System.out.println("Halo, " + getUser().getNama() + "! Uang cash sejumlah " + Main.formatRupiah(jumlah) + " telah masuk ke dompetmu!");
        super.withdraw(jumlah);
    }
    public void getInfo() {
        System.out.println("[ShopeePay e-Wallet]");
        super.getInfo();
    }
}
