package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
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
    TypesOfCoins t;

    public Loot(ChallengeRating challengeRating, LootList lootList, int d100){
        this.challenge=challengeRating;
        this.list=lootList;
        this.d100=d100;
    }

    @Override
    public LootList createStuff() {
        return null;
    }
}
