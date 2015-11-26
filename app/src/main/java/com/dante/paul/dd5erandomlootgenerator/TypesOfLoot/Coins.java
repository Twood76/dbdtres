package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.LootList;

/**
 * Created by PaulD on 2015-11-20.
 */
public abstract class Coins extends Loot {

    public Coins(ChallengeRating challengeRating, LootList lootList, int d100) {
        super(challengeRating, lootList, d100);
    }
    //TODO differentiate coin create between individual and horde
    @Override
    public LootList createStuff() {
        int numberOfCoins;
        switch (challenge) {
            case ZERO:
                if (d100 < 31) {
                    numberOfCoins = d.roll(5, 6);
                    list.addToCoins(t.COPPER, numberOfCoins);
                } else if (d100 < 61) {
                    numberOfCoins = d.roll(4, 6);
                    list.addToCoins(t.SILVER, numberOfCoins);
                } else if (d100 < 71) {
                    numberOfCoins = d.roll(3, 6);
                    list.addToCoins(t.GOLD, numberOfCoins);
                } else if (d100 < 96) {
                    numberOfCoins = d.roll(3, 6);
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                } else {
                    numberOfCoins = d.roll(1, 6);
                    list.addToCoins(t.PLATINUM, numberOfCoins);
                }
                break;
            case FIVE:
                if (d100 < 31) {
                    numberOfCoins = d.roll(4, 6) * 100;
                    list.addToCoins(t.COPPER, numberOfCoins);
                    numberOfCoins = d.roll(1, 6) * 10;
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                } else if (d100 < 61) {
                    numberOfCoins = d.roll(6, 6) * 10;
                    list.addToCoins(t.SILVER, numberOfCoins);
                    numberOfCoins = d.roll(2, 6) * 10;
                    list.addToCoins(t.GOLD, numberOfCoins);
                } else if (d100 < 71) {
                    numberOfCoins = d.roll(3, 6) * 10;
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                    numberOfCoins = d.roll(2, 6) * 10;
                    list.addToCoins(t.GOLD, numberOfCoins);
                } else if (d100 < 96) {
                    numberOfCoins = d.roll(4, 6) * 10;
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                } else {
                    numberOfCoins = d.roll(2, 6) * 10;
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                    numberOfCoins = d.roll(3, 6);
                    list.addToCoins(t.PLATINUM, numberOfCoins);
                }
                break;

            case ELEVEN:
                if (d100 < 21) {
                    numberOfCoins = d.roll(4, 6) * 100;
                    list.addToCoins(t.SILVER, numberOfCoins);
                    numberOfCoins = d.roll(1, 6) * 100;
                    list.addToCoins(t.GOLD, numberOfCoins);
                } else if (d100 < 36) {
                    numberOfCoins = d.roll(1, 6) * 100;
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                    numberOfCoins = d.roll(1, 6) * 100;
                    list.addToCoins(t.GOLD, numberOfCoins);
                } else if (d100 < 76) {
                    numberOfCoins = d.roll(2, 6) * 100;
                    list.addToCoins(t.GOLD, numberOfCoins);
                    numberOfCoins = d.roll(1, 6) * 10;
                    list.addToCoins(t.PLATINUM, numberOfCoins);
                } else {
                    numberOfCoins = d.roll(2, 6) * 100;
                    list.addToCoins(t.GOLD, numberOfCoins);
                    numberOfCoins = d.roll(2, 6) * 10;
                    list.addToCoins(t.PLATINUM, numberOfCoins);
                }
                break;

            case SEVENTEEN:
                if (d100 < 16) {
                    numberOfCoins = d.roll(2, 6) * 1000;
                    list.addToCoins(t.ELECTUM, numberOfCoins);
                    numberOfCoins = d.roll(8, 6) * 100;
                    list.addToCoins(t.GOLD, numberOfCoins);
                } else if (d100 < 56) {
                    numberOfCoins = d.roll(1, 6) * 1000;
                    list.addToCoins(t.GOLD, numberOfCoins);
                    numberOfCoins = d.roll(1, 6) * 100;
                    list.addToCoins(t.PLATINUM, numberOfCoins);
                } else {
                    numberOfCoins = d.roll(1, 6) * 1000;
                    list.addToCoins(t.GOLD, numberOfCoins);
                    numberOfCoins = d.roll(2, 6) * 100;
                    list.addToCoins(t.PLATINUM, numberOfCoins);
                }
                break;

        }
        return list;
    }
}

