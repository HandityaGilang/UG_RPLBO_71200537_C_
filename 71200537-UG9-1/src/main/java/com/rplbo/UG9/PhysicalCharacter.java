package com.rplbo.UG9;

public abstract class PhysicalCharacter extends Character {
    public PhysicalCharacter(String name, int damage, int health, int armor) {
        super(name, damage, health);
        this.armor = armor;
    }

    private int armor;

    public void ShowCharacterinfo(){
        System.out.println("Hero    : "+armor);

    }
    protected void attacked(int serangan){
        int totalserang = serangan - armor;
        super.attacked(totalserang);
    }
}
