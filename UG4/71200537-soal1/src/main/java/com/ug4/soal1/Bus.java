package com.ug4.soal1;

import java.sql.Driver;
import java.util.ArrayList;

public class Bus {
    private String name;

    private Driver driver;

    private int Capacity;

    private final ArrayList<Passenger> passenger;

    private int UsedCapacity;

    private final double fares;

    private double profit;

    private String[] ROUTE;

    public Bus(String name, com.ug4.soal1.Driver driver){
        this.name = name;
        this.driver=driver;
    }

    public String GetName(){
        return name;
    }

    public void setName(String setName){
        name = setName;
        }

    public Driver getDriver(){
        return driver;
    }

    public void SetDriver(Driver SetDriver){
        SetDriver = driver;
    }

    public int getCapacity() {
        return Capacity;
    }

    public ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public int getUsedCapacity() {
        return UsedCapacity;
    }

    private void setUsedCapacity(int setUsedCapacity){
        UsedCapacity = setUsedCapacity;
    }

    public double getFares(){
        return fares;
    }

    public double getProfit(){
        return profit;
    }

    public String[] getROUTE(){
        return ROUTE;
    }

    private void setProfit(double setProfit){
        profit = setProfit;
    }
    public boolean checkPassengerBalance(Passenger){

    }

    public void topUpBalance(double)
}
