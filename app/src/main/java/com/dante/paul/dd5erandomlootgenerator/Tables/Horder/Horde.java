package com.dante.paul.dd5erandomlootgenerator.Tables.Horder;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypesOfCoins;
import com.dante.paul.dd5erandomlootgenerator.LootList;

/**
 * Created by PaulD on 2015-11-20.
 */
public class Horde implements TreasureHorde {
    ChallengeRating challengeRating;
    int d100;
    Dice d;
    TypesOfCoins t;

    public Horde(ChallengeRating challengeRating, int d100) {
        this.challengeRating = challengeRating;
        this.d100 = d100;
    }

    @Override
    public LootList generateCoins(LootList list) {
        int numberOfCoins;
        switch (challengeRating) {
            case ZERO:
                numberOfCoins = d.roll(6, 6)*100;
                list.addToCoins(t.COPPER, numberOfCoins);
                numberOfCoins = d.roll(3, 6)*100;
                list.addToCoins(t.SILVER, numberOfCoins);
                numberOfCoins = d.roll(2, 6)*10;
                list.addToCoins(t.GOLD, numberOfCoins);
                break;
            case FIVE:
                numberOfCoins = d.roll(2, 6)*100;
                list.addToCoins(t.COPPER, numberOfCoins);
                numberOfCoins = d.roll(2, 6)*1000;
                list.addToCoins(t.SILVER, numberOfCoins);
                numberOfCoins = d.roll(6, 6)*100;
                list.addToCoins(t.GOLD, numberOfCoins);
                numberOfCoins = d.roll(3, 6)*10;
                list.addToCoins(t.PLATINUM, numberOfCoins);
                break;
            case ELEVEN:
                numberOfCoins = d.roll(4, 6)*1000;
                list.addToCoins(t.GOLD, numberOfCoins);
                numberOfCoins = d.roll(5, 6)*100;
                list.addToCoins(t.PLATINUM, numberOfCoins);
                break;
            case SEVENTEEN:
                numberOfCoins = d.roll(12, 6)*1000;
                list.addToCoins(t.GOLD, numberOfCoins);
                numberOfCoins = d.roll(8, 6)*1000;
                list.addToCoins(t.PLATINUM, numberOfCoins);
                break;
        }
        return list;
    }
    public LootList generateGemsOrArt(LootList list){
        int numberOfObject;
        switch (challengeRating){
            case ZERO:
                if(d100<3)
                    break;
                else if (d100<6){

                }
        }
        return list;
    }
}