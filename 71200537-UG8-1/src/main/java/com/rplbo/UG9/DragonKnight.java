package com.rplbo.UG9;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    public DragonKnight(){
        super("Dragon Knight",95,1800,50);
    }

    private int dragonFormAttack;

    public void skill() {
        dragonFormAttack = 2;
    }

    public void attack(Character karakter) {
        if (dragonFormAttack > 0){
            karakter.attacked(95+90);
            dragonFormAttack -= 1;
        }
        else {
            karakter.attacked(95);
        }
    }
}
