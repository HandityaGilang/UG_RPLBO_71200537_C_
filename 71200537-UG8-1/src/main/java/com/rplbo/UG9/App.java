package com.rplbo.UG9;

public class App 
{
    public static void main( String[] args )
    {
        Lina KarakterLina = new Lina();
        LegionCommander KarakterLegion = new LegionCommander();
        DragonKnight KarakterDragon = new DragonKnight();

        KarakterLina.skill(KarakterDragon);
        KarakterDragon.skill();
        KarakterLina.ShowCharacterInfo();
    }
}
