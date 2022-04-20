package com.rplbo.UG9;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina(){
        super("Lina",70,800,120);
    }
    public boolean skill(Character karakter){
        karakter.attacked(600);
        mana =-60;
        return true;
    }
    public void attack(Character karakter){
        karakter.attacked(600);
        if (karakter.isDie() == true){
            mana +=45;
        }
    }
}
