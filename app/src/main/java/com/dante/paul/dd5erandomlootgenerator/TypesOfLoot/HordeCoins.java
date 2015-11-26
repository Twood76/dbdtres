package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.LootList;

/**
 * Created by PaulD on 2015-11-23.
 */
public class HordeCoins extends Coins {

    public HordeCoins(ChallengeRating challengeRating, LootList lootList, int d100) {
        super(challengeRating, lootList, d100);
    }

    @Override
    public LootList createStuff() {
        int numberOfCoins;
        switch (challenge) {
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

}
