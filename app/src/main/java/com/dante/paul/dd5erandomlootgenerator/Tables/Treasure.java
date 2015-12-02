package com.dante.paul.dd5erandomlootgenerator.Tables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypesOfCoins;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.LootList;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Coins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.GemsArtAndMagicItems;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.HordeCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.IndividualCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Loot;


import java.util.Random;

/**
 * Created by PaulD on 2015-11-20.
 */
public class Treasure implements TreasureTable {
    protected ChallengeRating challengeRating;
    protected int d100;
    protected Dice d = new Dice();
    protected TypeOfEncounter toE;
    public LootList list;
    int numberOfIterations;

    public Treasure(ChallengeRating challengeRating, TypeOfEncounter toE, int numberOfIterations) {
        this.challengeRating = challengeRating;
        d100 = d.roll(100);
        list = LootList.getInstance();
        this.toE = toE;
        this.numberOfIterations = numberOfIterations;
    }

    public void generateTreasure(){
        for (int counter = 0; counter < numberOfIterations; counter ++) {
            generateCoins();
            if (toE == TypeOfEncounter.HORDE)
                generateItems();
        }
        list.getTreasure();
    }

    private void generateCoins() {
        if (toE == TypeOfEncounter.INDIVIDUAL) {
            Loot coins = new IndividualCoins(challengeRating, d100);
            coins.createStuff();
        } else {
            Loot coins = new HordeCoins(challengeRating, d100);
            coins.createStuff();
            Loot items = new GemsArtAndMagicItems(challengeRating, d100);
            items.createStuff();
        }
    }
    private void generateItems(){
        Loot items = new GemsArtAndMagicItems(challengeRating, d100);
        items.createStuff();
    }
}
