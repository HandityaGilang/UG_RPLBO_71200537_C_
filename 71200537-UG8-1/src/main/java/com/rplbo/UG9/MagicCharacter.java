package com.rplbo.UG9;

public abstract class MagicCharacter extends Character{
    public MagicCharacter(String name, int damage, int health, int mana) {
        super(name, damage, health);
        this.mana = mana;
    }
    protected int mana;

    public void attacked(int serangan){
        super.attacked(serangan);

    }

    public void ShowCharacterInfo(){
        System.out.println("Hero: "+mana);
    }
}
