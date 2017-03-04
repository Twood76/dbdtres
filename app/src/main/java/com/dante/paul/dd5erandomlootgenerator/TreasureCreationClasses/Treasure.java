package com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.LootList;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.GemsArtAndMagicItems;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.HoardCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.IndividualCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.Loot;



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
