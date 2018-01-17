package com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgeneratorpremium.Dice.Dice;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgeneratorpremium.LootList;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.GemsArtAndMagicItems;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.HoardCoins;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.IndividualCoins;



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
        list = LootList.getInstance();
        this.toE = toE;
        this.numberOfIterations = numberOfIterations;
    }

    public void generateTreasure(){
        for (int counter = 0; counter < numberOfIterations; counter ++) {
            d100 = d.roll(100);
            generateCoins();
            if (toE == TypeOfEncounter.HORDE)
                generateItems();
        }
        list.getTreasure();
    }

    private void generateCoins() {
        if (toE == TypeOfEncounter.INDIVIDUAL) {
            IndividualCoins coins = new IndividualCoins(challengeRating, d100);
            coins.createStuff();
        } else {
            HoardCoins coins = new HoardCoins(challengeRating, d100);
            coins.createStuff();
        }
    }
    private void generateItems(){
        GemsArtAndMagicItems items = new GemsArtAndMagicItems(challengeRating, d100);
        items.createStuff();
    }
}
