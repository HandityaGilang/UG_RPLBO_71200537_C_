package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }

    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal){
        setFeeTransferBank(ovoFeeTransferBank);
    }
}
