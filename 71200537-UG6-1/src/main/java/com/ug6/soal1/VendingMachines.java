package com.ug6.soal1;

public class VendingMachines {
    private String code;

    private int capacity;

    private int usedCapacity;

    private Goods goods;

    private double[] acceptanceBalance;

    private double consumerMoney;

    public void VendingMachine(String code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }

    public void VendingMachine(String code, int capacity, Goods goods, double[] acceptanceBalance){
        this.code = code;
        this.capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance=acceptanceBalance;
    }




}
