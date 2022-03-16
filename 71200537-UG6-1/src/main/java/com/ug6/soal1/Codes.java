package com.ug6.soal1;

public class Codes {
    private final String GOODSCODES = "GD";

    private final String VENDINGMACHINECODES = "VM";

    private final String[] TYPE = {"DR","FD","DG"};

    public String generateGoodsCode(String type, String name){
        return this.GOODSCODES+type+name.substring(0,2)+name.substring(Math.max(name.length() - 2, 0));
    }

    public String generateVendingMachinesCode(int order) {
        if (order < 10) {
            return this.VENDINGMACHINECODES + "0" + order;
        } else {
            return this.VENDINGMACHINECODES + order;
        }
    }
}
