package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypesOfCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Coins;

/**
 * Created by PaulD on 2015-11-23.
 */
public class HoardCoins extends Loot implements Coins {

    public HoardCoins(ChallengeRating challengeRating, int d100) {
        super(challengeRating, d100, TypeOfEncounter.HORDE);
    }
    @Override
    public void createStuff() {
        int numberOfCoins;
        switch (challenge) {
            case ZERO:
                numberOfCoins = d.roll(6, 6)*100;
                list.addToCoins(TypesOfCoins.COPPER, numberOfCoins);
                numberOfCoins = d.roll(3, 6)*100;
                list.addToCoins(TypesOfCoins.SILVER, numberOfCoins);
                numberOfCoins = d.roll(2, 6)*10;
                list.addToCoins(TypesOfCoins.GOLD, numberOfCoins);
                break;
            case FIVE:
                numberOfCoins = d.roll(2, 6)*100;
                list.addToCoins(TypesOfCoins.COPPER, numberOfCoins);
                numberOfCoins = d.roll(2, 6)*1000;
                list.addToCoins(TypesOfCoins.SILVER, numberOfCoins);
                numberOfCoins = d.roll(6, 6)*100;
                list.addToCoins(TypesOfCoins.GOLD, numberOfCoins);
                numberOfCoins = d.roll(3, 6)*10;
                list.addToCoins(TypesOfCoins.PLATINUM, numberOfCoins);
                break;
            case ELEVEN:
                numberOfCoins = d.roll(4, 6)*1000;
                list.addToCoins(TypesOfCoins.GOLD, numberOfCoins);
                numberOfCoins = d.roll(5, 6)*100;
                list.addToCoins(TypesOfCoins.PLATINUM, numberOfCoins);
                break;
            case SEVENTEEN:
                numberOfCoins = d.roll(12, 6)*1000;
                list.addToCoins(TypesOfCoins.GOLD, numberOfCoins);
                numberOfCoins = d.roll(8, 6)*1000;
                list.addToCoins(TypesOfCoins.PLATINUM, numberOfCoins);
                break;
        }
    }

}
