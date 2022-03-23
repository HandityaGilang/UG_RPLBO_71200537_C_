package com.ug7.ewallet;

public class eWallet {
    //variable
    private User user;
    private int saldo;

    //method
    public User getUser() {
        return this.user;
    }
    public int getSaldo() {
        return this.saldo;
    }
    public eWallet(User user) {
        this.user = new User(user.getNama(), user.getEmail(), user.getUang());
    }
    public void topup(int jumlah) {
        if (this.user.getUang()< jumlah) {
            System.out.println("uang tidak cukup");
            return;
        }
        else {
            this.user.topup(jumlah);
            this.saldo = this.saldo - jumlah;
            System.out.println(getUser().getNama() + " Top up saldo sebesar  Rp." + jumlah + " berhasil");
        }
    }
    public void transfer(eWallet eWallet, int jumlah) {
        if (jumlah > this.saldo) {
            System.out.println("saldo tidak cukup " + Main.formatRupiah(this.saldo - jumlah) );
            return;
        }
        else{
            this.saldo = this.saldo - jumlah;
            System.out.println("Transfer saldo sejumlah Rp" + jumlah + " berhasil!");
        }
    }
    public void withdraw(int jumlah) {
        if (jumlah > this.saldo) {
            System.out.println("saldo tidak cukup " + Main.formatRupiah(this.saldo - jumlah));
            return;
        }
        this.saldo = this.saldo - jumlah;
        this.user.withdraw(jumlah);
    }
    public void getInfo() {
        System.out.println("Nama: " + this.user.getNama() + " [PIN:" + this.user.getPIN() + "]");
        String email = "";
        if (this.user.isEmailConfirmed())
            email = "Confirmed";
        System.out.println("Email: " + this.user.getEmail() + " " + email);
        System.out.println("Uang cash: Rp." + this.user.getUang());
        System.out.println("Saldo e-wallet:  Rp."+ getSaldo());
        System.out.println();
    }
}
