package com.dante.paul.dd5erandomlootgenerator.Tables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypesOfCoins;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.LootList;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Coins;



import java.util.Random;

/**
 * Created by PaulD on 2015-11-20.
 */
public class Treasure implements TreasureTable{
    protected ChallengeRating challengeRating;
    protected int d100;
    protected Dice d;
    protected TypesOfCoins t;
    protected LootList list;
    protected Random r;
    protected TypeOfEncounter toE;

    public Treasure(ChallengeRating challengeRating) {
        this.challengeRating = challengeRating;
        d100 = d.roll(100);
        list = new LootList();
    }

    @Override
    public LootList generateCoins(LootList list) {
        if(toE.INDIVIDUAL)
        Coins coins = new Coins(challengeRating, list, d100);
        list = coins.createStuff();
        return list;
    }
}
