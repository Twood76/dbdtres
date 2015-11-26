package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.LootList;

/**
 * Created by PaulD on 2015-11-20.
 */
public class GemsArtAndMagicItems extends Loot {
    private int numberOfGemsOrArt;
    private GemTypes g;
    private ArtTypes a;

    public GemsArtAndMagicItems(ChallengeRating challengeRating, LootList lootList, int d100) {
        super(challengeRating, lootList, d100);
    }

    @Override
    public LootList createStuff() {
        switch (challenge) {
            case ZERO:
                if (d100 < 7) {//no gems or art
                } else if (d100 < 17) {
                    numberOfGemsOrArt = d.roll(2, 6);
                    generateGemsOrArt(numberOfGemsOrArt, 10,g);
                }else if (d100 < 27){
                    numberOfGemsOrArt = d.roll(2, 4);
                    generateGemsOrArt(numberOfGemsOrArt, 25,a);
                } else if (d100 < 37) {
                    numberOfGemsOrArt = d.roll(2, 6);
                    generateGemsOrArt(numberOfGemsOrArt, 50, g);
                }else if (d100 < 45) {
                    numberOfGemsOrArt = d.roll(2, 6);
                    generateGemsOrArt(numberOfGemsOrArt, 10, a);
                }
        }
        return list;
    }

    private void generateGemsOrArt(int numberOfGemsOrArt, int value, ValueableItems vI) {
        for (int counter = 0; counter < numberOfGemsOrArt; counter++) {
            list.addToLoot(vI.getItem(value));
        }
    }
}
