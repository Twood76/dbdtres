package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypesOfCoins;
import com.dante.paul.dd5erandomlootgenerator.LootList;

/**
 * Created by PaulD on 2015-11-20.
 */
public abstract class Loot implements CreateLoot{
    ChallengeRating challenge;
    LootList list;
    int d100;
    Dice d;
    TypeOfEncounter typeOfEncounter;

    public Loot(ChallengeRating challengeRating, int d100, TypeOfEncounter typeOfEncounter){
        this.challenge=challengeRating;
        list=LootList.getInstance();
        this.d100=d100;
        this.typeOfEncounter = typeOfEncounter;
    }

    public LootList createStuff() {
        return null;
    }
}
