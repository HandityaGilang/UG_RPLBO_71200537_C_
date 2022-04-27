package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public class MobileWallet extends com.ug9.eTransactionProject.DigitalPayment {
    private String noHp;

    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama,saldo);
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (getSaldo() < 0 ){
            System.out.println("Input tidak valid");
        }
        else if (getSaldo() < nominal){
            System.out.println("Transfer gagal saldo tidak mencukupi");
        }
        else if (getSaldo() > nominal){
            long saldoskrg = getSaldo();
            long saldoorg = dp.getSaldo();
            if (dp instanceof BRImo){
                setSaldo(getSaldo()-(nominal+feeTransferBank));
                dp.setSaldo(dp.getSaldo() + nominal);

            }else if (dp instanceof BNImo){
                setSaldo(getSaldo()-(nominal+feeTransferBank));
                dp.setSaldo(dp.getSaldo() + nominal);
            }
        }
        printBuktiTransfer(dp, nominal);

    }
}
