package com.ug6.soal1;

public class Goods {
    private String code;

    private String name;

    private int quantity;

    private double price;

    public Goods(String code, String name, int quantity, double price){
        this.code = code;
        this.name = name;
        this.quantity= quantity;
        this.price = price;
    }

    public Goods(String code, String name){
        if (this.quantity == 0 ){
            this.code = code;
            this.name = name;
        }
    }
}
