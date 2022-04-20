package com.rplbo.UG9;

public class LegionCommander extends PhysicalCharacter implements TargetSkill {
    public LegionCommander(){
        super("Legion Commander",120,1200,30);
    }
    private int kill;

    public boolean skill(Character karakter){
        while (karakter.isDie() == false){
            attack(karakter);
            attacked(karakter.damage);
        }
        kill += 1;
        return true;
    }
    public void attack(Character karakter){
        karakter.attacked(120+10+kill);
    }

}
