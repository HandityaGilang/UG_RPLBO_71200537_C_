package com.rplbo.UG9;

public abstract class Character implements ObjectAttack{
    public int damage;
    public String name;
    public int health;
    public Character(String name,int damage,int health){
        name = this.name;
        damage = this.damage;
        health = this.health;
    }
    public void ShowCharacterInfo(){
        System.out.println("Hero: " + this.name);
        System.out.println("Hero: " + this.health);
        System.out.println("Hero: " + this.damage);
    }
    public boolean isDie(){
        if (health <= 0 ){
            return true;
        }
        else {
            return false;
        }

    }
    protected void attacked(int serang){
        if (serang <= 0){
            return;
        }
        else {
            this.health =- serang;
        }
    }
}
