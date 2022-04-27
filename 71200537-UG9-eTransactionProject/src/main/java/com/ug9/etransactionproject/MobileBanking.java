package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public class MobileBanking extends com.ug9.eTransactionProject.DigitalPayment {
    private boolean checkFee = false;

    private long feeAntarBank = 6000;

    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama,saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        long saldoskrg = getSaldo();
        long saldoorg = dp.getSaldo();
        if (saldoskrg < 0 ){
            System.out.println("Input tidak valid");
        }
        else if (saldoskrg < nominal){
            System.out.println("Transfer gagal saldo tidak mencukupi");
        }
        else if (saldoskrg > nominal){
            if (isCheckFee() == true){
                setSaldo(getSaldo()-(nominal+feeAntarBank));
                dp.setSaldo(dp.getSaldo() + nominal);
                setCheckFee(false);
            }else if (isCheckFee() == false){
               setSaldo(getSaldo()-nominal);
               dp.setSaldo(dp.getSaldo() + nominal);
            }
        }
        printBuktiTransfer(dp, nominal);

    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}
